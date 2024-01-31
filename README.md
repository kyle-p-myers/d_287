<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
B.  Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.


C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
    mainscreen.html: Line 14: Updated Title to reflect shop name
    mainscreen.html: Line 19: Updated Shop Name again at top of page
    mainscreen.html: Line 22: Added About Us button to take user to the about page. 

Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.


D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
    About.html: Line 1 - 56: Added an About us Page. This included basic information about the shop and some more information about dedication etc..
    About.html:Line 40: Included nav button to lead user back to homepage

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
    BootStrapData.java: 
    BootStapDate.java: Lines 41 - 79 Added 5 separate outsourced parts
    Lines 82 - 85: Add code to retrieve list of all Outsourcedpart objects from the repository by utilizing the findAll() method. Iterated over data, namely the outsourced part list using a for
    each loop. Printed information, specifically the part name, and the company name using getters. 
    Lines 91 - 95: Created 5 new Products and saved to repository. 
    

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.


F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

    •   The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
    
    mainscreen.html:    
Lines 138 - 140: Added 'Buy Now' button with confirmation and dynamic product ID attachment 
Adjusted data binding for Buy Now button (Lines 93-95) to ensure correct product ID evaluation.
Enhanced the buyProduct JavaScript function for proper redirection based on product ID (Lines 108-111).
    
      
    
      •   Display a message that indicates the success or failure of a purchase.
AddProductController.java:
- Updated the `/buyproduct` endpoint (starting from the `@GetMapping` annotation) to process product purchase and navigate to either the confirmation or error page based on the inventory status.


G. Modify the parts to track maximum and minimum inventory by doing the following:

    •   Add additional fields to the part entity for maximum and minimum inventory.
InhousePart.java (Lines 18 & 19) / OutsourcedPart.java (Lines 18 & 19) - Added default min and max to existing constructors.

        •   Modify the sample inventory to include the maximum and minimum fields.
Part.java - Add validation (Line 32 & 33) and getters/setters for minimum and maximum inventory values (Lines 57 - 71)

        •   Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
OutsourcedPartForm.html: Lines 27 - 43 & InhousePartForm.html: Line 24 - 34 -- Add additional form fields so user can adjust the max and min values for outsourced parts.

    •   Rename the file the persistent storage is saved to.
application.properties: Adjusting the location of the H2 database file from home directory to project directory.

    •   Modify the code to enforce that the inventory is between or at the minimum and maximum value.
Part.java Lines 101 - 107: Ensure inventory stays within minimum and maximum limits with validateLimits() method.

InhousePartServiceImpl & OutsourcedPartServiceImpl Line 54: Invoke validateLimits() to ensure part's inventory stays within defined bounds before saving.


    H. Add validation for between or at the maximum and minimum fields. The validation must include the following:
Part.java Lines 4 -5 & 24 - 35: Annotated Part.java with custom validators for inventory bounds: @ValidPartInventory and @ValidPartInventoryMinimum.

PartInventoryMinimumValidator.java Lines 1 - 27 :Implemented PartInventoryMinimumValidator class to enforce inventory minimum constraints on Part domain. 
Integrated ApplicationContext for potential spring beans utilization and ensured inventory exceeds the specified minimum value.

PartInventoryValidator.java Lines 1 - 32: Implemented PartInventoryValidator class for validating the Part domain's inventory against its maximum value. 
Integrated ApplicationContext for potential spring beans access and ensured that the inventory does not exceed the designated maximum limit.

ValidPartInventory.java Lines 1 - 23: Introduced the ValidPartInventory custom annotation for inventory validation. This annotation ensures that the inventory 
of a Part does not exceed its maximum value by linking it to the PartInventoryValidator class. It's designed for type-level constraints and is retained at 
runtime for reflection capabilities.

ValidPartInventoryMinimum.java Lines 1 - 25:Implemented ValidPartInventoryMinimum annotation for inventory validation. This custom annotation ensures 
that the inventory of a Part doesn't fall below the set minimum value. It's associated with the PartInventoryMinimumValidator class 
for validation logic, intended for type-level constraints, and retains runtime visibility for reflective operations.

    I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
PartTest.java Lines 160 - 176 : Added unit tests to validate 'getMinimum' and 'getMaximum' methods in the Part class:
- Set and verify the 'minimum' value for partIn and partOut objects.
- Set and verify the 'maximum' value for partIn and partOut objects.


    J.  Remove the class files for any unused validators in order to clean your code.
Validator Review: 
Part.java: ALL IN USE (see below):
(Line 21) @ValidDeletePart -- Ensures that parts cannot be removed if they are linked to a product.
(Line 25) @ValidPartInventory -- Restricts the addition of extra part inventory when it surpasses the defined maximum limit.
(Line 26) @ValidPartInventoryMinimum -- Blocks updates to part inventory if the alterations result in a quantity less than the minimum threshold.

Product.java: ALL IN USE (see below):
(Line 20) @ValidProductPrice -- Ensures the product's price is not set below the total cost of its constituent parts.
(Line 21) @ValidEnuffParts -- Restricts augmenting the inventory of a product if the inventory of its associated parts is insufficient.