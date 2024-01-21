 The SoulmateFinder program is a program contained in a single class. It reads the time journeys started and ended, and the names of travelers and it outputs potential soulmates.
 
 The code is separated into five methods: input- a scanner, overlappingJourneys, getTravellers, overlappingLongJourneys, and main.
 
 The input method is for a system input scanner. It is used to shorten the code, instead of constantly adding different scanners in each method. this could be a centralized system input scanner.
 
 The overlappingJourneys method is a boolean method for checking if the start of a traveller's journey overlaps with the end of another traveller's journey. it reads the start and end journey times for both travellers and returns true if the journeys overlap.
 
 The getTravellers method reads the start and end journey times of the user and is used to check if travellers on the train might be potential soulmates and returns the number of potential soulmates. the method first asks the total number of travellers in the train which is stored in a variable numTravellers to know how many iterations will be performed. the variable potential soulmate is initialised to 0 because it will be used to store the number of potential soulmates in the iteration. a for loop is used instead of a while loop because there is a known number of iterations to be performed. in the loop, it asks for information about the traveller, the name, board time, and exit time, it then uses an if function and overlappingJourneys method to check if the traveller overlaps the journey with the user, if so potential soulmates increase by 1 and prints out travellersname and " might be your soulmate". if not it will print the travellername and " might not be your soulmate".

 The overlappinLongJourneys method is a boolean method that reads the start and end times of travellers and a number, if the number of stops the user spends with the traveller is more than that number it returns true.
 
 The main method takes a file from the command line, if no file is specified it uses the getTraveller method to enter the traveller's information manually. if the file is specified it reads the file to get the name and times of the traveller. there is a try-catch function checking for a filenotfound error which prints the "warning" and the file name "is not found.




