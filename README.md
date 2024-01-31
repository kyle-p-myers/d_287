		
Updated README file to annotate validator review for class files.

•	PartTest.java Lines 160 - 176: Added unit tests to validate 'getMinimum' and... 


PartTest.java 
Lines 160 - 176: Added unit tests to validate 'getMinimum' and 'getMaximum' methods in the Part class:
Set and verify the 'minimum' value for partIn and partOut objects.
Set and verify the 'maximum' value for partIn and partOut objects.
	
Part.java 
    Lines 4 -5 & 24 - 35: Annotated Part.java with custom validators for... 
    
Part.java 
Lines 4 -5 & 24 - 35: Annotated Part.java with custom validators for inventory bounds: @ValidPartInventory and @ValidPartInventoryMinimum.


PartInventoryMinimumValidator.java 
Lines 1 - 27 :Implemented PartInventoryMinimumValidator class to enforce inventory minimum constraints on Part domain. Integrated ApplicationContext for potential spring beans utilization and ensured inventory exceeds the specified minimum value.

PartInventoryValidator.java 
Lines 1 - 32: Implemented PartInventoryValidator class for validating the Part domain's inventory against its maximum value. Integrated ApplicationContext for potential spring beans access and ensured that the inventory does not exceed the designated maximum limit.

ValidPartInventory.java 
Lines 1 - 23: Introduced the ValidPartInventory custom annotation for inventory validation. This annotation ensures that the inventory of a Part does not exceed its maximum value by linking it to the PartInventoryValidator class. It's designed for type-level constraints and is retained at runtime for reflection capabilities.

ValidPartInventoryMinimum.java 
Lines 1 - 25:Implemented ValidPartInventoryMinimum annotation for inventory validation. This custom annotation ensures that the inventory of a Part doesn't fall below the set minimum value. It's associated with the PartInventoryMinimumValidator class for validation logic, intended for type-level constraints, and retains runtime visibility for reflective operations.

	
Part.java 
Lines 101 - 107: Ensure inventory stays within minimum and maximum... 

Part.java Lines 101 - 107: 
Ensure inventory stays within minimum and maximum limits with validateLimits() method.

InhousePartServiceImpl & OutsourcedPartServiceImpl 
Line 54: Invoke validateLimits() to ensure part's inventory stays within defined bounds before saving.

	
application.properties: Adjusting the location of the H2 database file from... 

application.properties: Adjusting the location of the H2 database file from home directory to project directory.

	
OutsourcedPartForm.html: 
Lines 27 - 43 & InhousePartForm.html: Line 24 - 34 ... 

OutsourcedPartForm.html:
Lines 27 - 43 & InhousePartForm.html: Line 24 - 34 -- Add additional form fields so user can adjust the max and min values for outsourced parts.
		
InhousePart.java 
(Lines 18 & 19) / OutsourcedPart.java (Lines 18 & 19) - Added... 

InhousePart.java (Lines 18 & 19) / OutsourcedPart.java (Lines 18 & 19) 

Part.java - Add validation (Line 32 & 33) and getters/setters for minimum and maximum inventory values (Lines 57 - 71)
Updated Buy Now functionality and routing. 

mainscreen.html:
•		- Adjusted data binding for Buy Now button (Lines 93-95) to ensure correct product ID evaluation.
•		- Enhanced the buyProduct JavaScript function for proper redirection based on product ID (Lines 108-111).
•		
•		AddProductController.java:
•		- Updated the `/buyproduct` endpoint (starting from the `@GetMapping` annotation) to process product purchase and navigate to either the confirmation or error page based on the inventory status.


	
BootStapDate.java: 
Lines 38 - 129 Add initial data for parts, outsourced parts, and products 

- Add 5 new InhousePart objects with specific properties for motherboards
•		- Add 5 new OutsourcedPart objects with specific properties for computer cases
•		- Modify properties of Product objects and add them to initial data
•		- Ensure data is only added if the repositories are empty

	
BootStapDate.java: 
Lines 41 - 79 Added 5 separate outsourced parts 
Lines 82 - 85: Add code to retrieve list of all Outsourcedpart objects from the repository by utilizing the findAll() method. Iterated over data, namely the outsourced part list using a for
•		each loop. Printed information, specifically the part name, and the company name using getters.
•		Lines 91 - 95: Created 5 new Products and saved to repositotry.
•		wrapped the "About Us" and "Home" buttons in a div with the class button-container.
•		about.html: Line 35: I applied center-aligning to the buttons using CSS by setting text-align: center for the .button-container.
•	Line 47 & 51: I added separate classes btn-about and btn-home to each button for custom styling to differentiate them.





BootStapDate.java: 
Lines 41 - 79 Added 5 separate outsourced parts 
Lines 82 - 85: Add code to retrieve a list of all Outsourcedpart objects from the repository by utilizing the findAll() method. Iterated over data, namely the outsourced part list using a foreach loop. Printed information, specifically the part name, and the company name using getters. 
Lines 91 - 95: Created 5 new Products and saved to repository.

		
BootStapDate.java: 
Lines 41 - 79 Added 5 separate outsourced parts 
Lines 82 - 85: Add code to retrieve a list of all Outsourcedpart objects from the repository by utilizing the findAll() method. Iterated over data, namely the outsourced part list using a for each loop. Printed information, specifically the part name, and the company name using getters.
Lines 91 - 95: Created 5 new Products and saved to repository.

		
about.html: Added home back to take the user back to the main page 

mainscreen.html: Created an about button to take the user to the about page of LLC.

	
Created and Added About.html file. 
Kyle Myers authored 1 month ago
Created and added AboutController.java with @GetMapping and @controller annotations.

	
updated mainscreen.html with the shop name on line 14 and line 19. Annotated those... 

updated mainscreen.html with the shop name on line 14 and line 19. Annotated those changes on the README file.


	
Update README file to include tasks and instructions for each step, testing... 
updated README file to include tasks and instructions for each step, testing commit, and push commands

