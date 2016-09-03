package nyc.c4q;

import java.util.*;


        class Main {


            public static void main(String[] args) {
                //FUNCTION CALLS FOR THE QUESTIONS.

                // System.out.println(add(100,10));
                // calculateAge(1990, 2016);
                //	xoXO("xoxoxoXOXOXOxOxOxXoo");
                //	System.out.println(endsly("beLY"));
                //	chessBoard(3);
                //	hungryHippo();
                //	stringElide("PUMPKIN CATAPULT A");
                // createTriangle(11);
                // countCode("codecodecodec0deCOXEco1ecoNE");
                //	vowelCount("codecodecodec0deCOXEco1ecoNE");
                //	System.out.println(cutIt("this is how we do", 'w'));
                //	christmasCarol();
                //	iceCream();

            }
            //Q1. Returns the sum of two numbers
            public static double add (double x, double y){
                return x + y;
            }
            // Q2. Prints someone's age based off birth year (int a) & current year (int b).
            public static void calculateAge(int a, int b){
                int age = b - a;
                System.out.println("You are " + (age-1) + " or " + age);
            }

            //Q3. created a loop to iterate through the string by calling the length function. While comparing each character in the string I counted each time the character x and o showed up.
            public static boolean xoXO(String xoxo){
                char x = 'X';
                char o = 'O';
                int xOccurances = 0;
                int oOccurances = 0;
                for (int i = 0; i<xoxo.length(); i++){
                    if (xoxo.toUpperCase().charAt(i) == x){
                        xOccurances++;
                    }
                    if (xoxo.toUpperCase().charAt(i) == o ){
                        oOccurances++;
                    }
                }
                if (xOccurances == oOccurances){
                    return true;
                }
                else
                    return false;
            }

            // Q4. Checked if the 2nd to last letter is 'l' and the last letter being 'y'.
            public static boolean endsly (String ly){
                char el = 'l';
                char why = 'y';
                if ((ly.toLowerCase().charAt(ly.length()-2) == el) && (ly.toLowerCase().charAt(ly.length()-1) == why) ){
                    return true;
                }
                else
                    return false;

            }
            //Q5. I looped for the size of chess board and set a temporary value = to that of size because boardds are generally two equal sides. I printed a pattern of '#'s and "_" based on if the line is even or odd.
            public static void chessBoard(int size){

                int line = 0;
                for (int i = size; i>0; i--){
                    line++;
                    int temp = size;
                    System.out.print("\n");
                    if (line%2 == 0){
                        while (temp > 0){
                            temp--;
                            System.out.print("_");
                            if (temp > 0){
                                System.out.print("#");
                                --temp;
                            }
                        }
                    }else
                        while (temp > 0){
                            --temp;
                            System.out.print("#");
                            if (temp > 0){
                                System.out.print("_");
                                --temp;
                            }
                        }
                }
            }
            // Q6. Checked the 1st character in the string for a 'H'
            public static void hungryHippo(){
                char capitalH = 'H';
                System.out.println("Enter FOOD:");
                Scanner in = new Scanner(System.in);
                String userInput = in.nextLine();
                if(userInput.toUpperCase().charAt(0) == capitalH){
                    System.out.println("Yum!");
                }else
                    System.out.println("Yuck!");

            }
            //Q7. Nested two loops(the 'for' is handling the height, the while handles the width printed.
            public static void createTriangle(int triangleSz){
                for (int i = 0; i < triangleSz + 1; i++){
                    int j = 0;
                    System.out.print("\n");
                    while (i != j){
                        System.out.print("*");
                        ++j;
                    }

                }
                System.out.println("");
            }

            //Q8. Solving this problem I checke the length of the string, if larger than 8 I looped through the first 3 characters, printed those and added the lastChar.
            public static void stringElide(String thisStr){
                String lastChar = thisStr.substring(thisStr.length()-1);
                if(thisStr.length() < 8){
                    System.out.println(thisStr);
                }else{
                    for (int j = 0; j < 3 ; j = j+1 ){
                        System.out.print(thisStr.charAt(j));
                    }
                    System.out.print("..." + lastChar);
                }
            }
            //Q9. Iterated through the string if I found a 'c' I checked the 1st and 3 characters after and compared them to 'd' & 'e' respectively.
            public static void countCode (String aString){
                int co_eOccurances = 0;
                aString = aString.toLowerCase();
                for (int q = 0; q < aString.length(); q++){
                    if (aString.charAt(q) == 'c'){
                        if((aString.charAt(q+1) == 'o') && (aString.charAt(q+3) == 'e')){
                            co_eOccurances++;
                        }
                    }
                }
                System.out.println("Something resembling 'code' appeared : " + co_eOccurances + " time(s)!");
            }

            //Q10. I turned the string to lower case to compare the string being passed into the vowelCount function to a string 'aeiou'. I nested loop to compare each value in the string to every letter in my vowel string
            public static int vowelCount (String bString){
                String vowels = "aeiou";
                bString = bString.toLowerCase();
                int numVowels = 0;
                for (int i = 0; i < bString.length(); i++){
                    for (int j = 0; j < vowels.length(); j++){
                        if(bString.charAt(i) == vowels.charAt(j)){
                            numVowels++;
                            break;
                        }
                    }
                }
                return numVowels;
            }

            //Q11. I created a while loop to find where the character shows up in the string and then i used the built in substring method to solve the problem for me.
            public static String cutIt(String cString, char aChar){
                int j = 0;
                while(cString.charAt(j) != aChar){
                    ++j;
                }
                return cString.substring(j);
            }

            //Q12. On question 12 I looped the day of christmas with a switch in the body. The switch staetement checks what day of christmas we're in and prints a statement based on day.
            public static void christmasCarol(){
                int dayOfXmas = 0;
                while (dayOfXmas < 13) {
                    switch(dayOfXmas) {
                        case 12:  System.out.println("On the 12th day of Christmas my true love gave to me 12 Drummers Drumming");
                        case 11:   if(dayOfXmas == 11) {
                            System.out.println("On the 11th day of Christmas my true love gave to me 11 Pipers Piping");
                        }else
                            System.out.println("11 pipers piping");

                        case 10:   if(dayOfXmas == 10){
                            System.out.println(" On the 10th day of Christmas my true love gave to me 10 Lords a-Leaping");
                        }else
                            System.out.println("10 Lords a Leaping");

                        case 9:    if (dayOfXmas == 9){
                            System.out.println("On the 9th day of Christmas my true love gave to me 9 Ladies Dancing");
                        }else
                            System.out.println("9 Ladies Dancing");

                        case 8:    if(dayOfXmas == 8){
                            System.out.println("On the 8th day of Christmas my true love gave to me 8 Maids a-Milking");
                        }else
                            System.out.println("8 Maids a-Milking");

                        case 7:    if(dayOfXmas == 7){
                            System.out.println("On the 7th day of Christmas my true love gave to me 7 Swans a-Swimming");
                        }else
                            System.out.println("7 Swans a-Swimming");
                        case 6:    if (dayOfXmas == 6){
                            System.out.println("On the 6th day of christmas my true love gave to me 6 Geese A-Laying");
                        }else
                            System.out.println("6 Geese A-Laying");

                        case 5:    if(dayOfXmas == 5){
                            System.out.println("On the 5th day if Christmas my true love gave to me 5 gold rings");
                        }else
                            System.out.println("5 Gold Rings");


                        case 4:   if(dayOfXmas == 4){
                            System.out.println("On the 4th day of Christmas my true love gave to me 4 calling birds");
                        }else
                            System.out.println("4 calling birds");

                        case 3:	 	if(dayOfXmas == 3){
                            System.out.println("On the 3rd day of Christmas my true love gave to me 3 French Hens");
                        }else
                            System.out.println("3 french Horns");

                        case 2:  	if(dayOfXmas == 2){
                            System.out.println("On the 2nd day of Christmas my true love gave to me Two turtle Turtle Doves");
                        }else
                            System.out.println("2 Turtle Doves");

                        case 1:	 	if(dayOfXmas == 1){
                            System.out.print("On the 1st day of Christmas my true love gave to me Partridge in a  pear tree");
                        }else
                            System.out.println("and a Partridge & a Pear Tree! ");


                    }
                    dayOfXmas++;
                }
            }
            //Q13. For the last question I took input for user name and how many toppings they wanted. I used a math function to calculate delivery time and printed the data.
            public static void iceCream(){
                int numToppings = 0;
                double totalCost ;
                double deliveryTime = Math.floor(Math.random()*60); // random generator of minutes within the scope of 60.
                System.out.println("What is your name?");
                Scanner in = new Scanner(System.in);
                String userName = in.nextLine();
                System.out.println("OK " + userName + " What type of ice cream would you like?");
                String iceCreamType = in.nextLine();
                System.out.println("Would you like Chocolate chips?");
                String wantChocolateChips = in.nextLine();
                if (wantChocolateChips.toLowerCase().substring(0,1).equals("y")){
                    numToppings++;
                }
                System.out.println("Would you like Bananas on your ice cream?");
                String wantBananas = in.nextLine();
                if (wantBananas.toLowerCase().substring(0,1).equals("y")){
                    numToppings++;
                }
                System.out.println("Would you like gummy bears?");
                String wantGummyBears = in.nextLine();
                if (wantGummyBears.toLowerCase().substring(0,1).equals("y")){
                    numToppings++;
                }

                if (numToppings == 3){
                    totalCost = 3.33;
                }else
                    totalCost = 2.33 + (.33 * numToppings);

                System.out.println("ok " + userName + " you want a " + iceCreamType + " ice cream with " + numToppings + " topping(s), that will be a total of $" + totalCost + " and you ice cream will arive in " + deliveryTime + " minutes!" );


            }

        }

/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/





