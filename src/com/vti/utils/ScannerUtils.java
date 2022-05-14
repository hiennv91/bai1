package TestingSystem.Assignment11.utils;

import java.util.Scanner;

public class ScannerUtils {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * This method is for input exactly an Integer number
     * @param errorMessage
     * @return
     */
    public static int inputInt(String errorMessage) {
        while (true) {
            try {
                String input = scanner.nextLine();
                input = input.trim();
                int output = Integer.parseInt(input);
                return output;
            } catch (Exception e) {
                System.err.println(errorMessage);
                System.out.print("Mời bạn nhập lại int number: ");
            }
        }
    }

    /**
     * This method is for input exactly a float number
     * @param errorMessage
     * @return
     */
    public static float inputFloat(String errorMessage) {
        while (true) {
            try {
                String input = scanner.next();
                input = input.trim();
                float output = Float.parseFloat(input);
                return output;
            } catch (Exception e) {
                System.err.println(errorMessage);
                System.out.print("Mời bạn nhập lại float number: ");
            }
        }

    }

    /**
     * This method is for input exactly a double number
     * @param errorMessage
     * @return
     */
    public static double inputDouble(String errorMessage) {
        while (true) {
            try {
                String input = scanner.next();
                input = input.trim();
                double output = Double.parseDouble(input);
                return output;
            } catch (Exception e) {
                System.err.println(errorMessage);
                System.out.print("Mời bạn nhập lại double number: ");
            }
        }

    }
    /**
     * This method is for input exactly a String
     * @return
     */
    public static String inputString(String errorMessage) {
        while (true) {
            String inputStr = scanner.nextLine();
            if (!inputStr.isEmpty()) {
                inputStr = inputStr.trim();
                inputStr = inputStr.replaceAll("\\s+", " ");
                return inputStr;
            } else {
                System.err.println(errorMessage);
                System.out.print("Mời bạn nhập lại: ");
            }
        }
    }
    /**
     * This method is for input exactly age of Use
     * @param errorMessage
     * @return
     */

    public static int inPutAge(String errorMessage) {
        while (true) {
            int age = ScannerUtils.inputInt(errorMessage);
            if (age > 16 && age < 60) {
                return age;
            } else {
                System.err.println(errorMessage);
                System.out.print("Mời bạn nhập lại age: ");
            }
        }
    }

    public static int inputFunction(int a, int b, String errorMessage) {
        while (true) {
            int number = ScannerUtils.inputInt(errorMessage);
            if (number >= a && number <= b) {
                return number;
            } else {
                System.err.println(errorMessage);
            }
        }
    }
    /**
     * This method is for input exactly Email
     * @param errorMessage
     * @return
     */
    public static String inputEmail(String errorMessage) {
        while (true) {
            String email = ScannerUtils.inputString(errorMessage);
            if (email == null || !email.contains("@")) {
                System.err.println(errorMessage);
                System.out.print("Mời bạn nhập lại email: ");
            } else {
                return email;
            }
        }
    }
    /**
     * This method is for input exactly Password
     * @return
     */
    public static String inputPassword(String errorMessage) {
        while (true) {
            String password = ScannerUtils.inputString(errorMessage);
            if (password.length() < 6 || password.length() > 12) {
                System.err.println(errorMessage);
                System.out.print("Mời bạn nhập lại password: ");
                continue;
            }

            boolean hasAtLeast1Character = false;

            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i)) == true) {
                    hasAtLeast1Character = true;
                    break;
                }
            }
            if (hasAtLeast1Character == true) {
                return password;
            } else {
                System.err.println(errorMessage);
                System.out.print("Mời bạn nhập lại password: ");
            }
        }
    }

    public static String inputPhoneNumber(String errorMessage) {
        while (true) {
            String number = ScannerUtils.inputString(errorMessage);
            if (number.length() > 12 || number.length() < 9) {
                System.err.println(errorMessage);
                continue;
            }

            if (number.charAt(0) != '0') {
                System.err.println(errorMessage);
                continue;
            }

            boolean isNumber = true;

            for (int i = 0; i < number.length(); i++) {
                if (Character.isDigit(number.charAt(i)) == false) {
                    isNumber = false;
                    break;
                }
            }
            if (isNumber == true) {
                return number;
            } else {
                System.out.println(errorMessage);
                System.out.print("Mời bạn nhập lại phone number: ");
            }

        }
    }
    /**
     * This method is for input exactly a Positive Integer
     * @param errorMessage
     * @return
     */
    public static int inputPositiveInt(String errorMessage) {
        while (true) {
            int id = ScannerUtils.inputInt(errorMessage);
            if (id < 0) {
                System.err.println(errorMessage);
            } else {
                return id;
            }
        }
    }

    /**
     * This method is for input exactly a name
     * @param errorMessage
     * @return
     */
    // NHẬP VÀO TÊN VÀ CHUẨN HÓA TÊN:
    public static String inputName(String errorMessage) {
        while (true) {
            String name = ScannerUtils.inputString(errorMessage);
            String[] words = name.split(" ");
            name = "";
            for (String word : words) {
                String firstCharacter = word.substring(0, 1).toUpperCase();
                String leftCharacter = word.substring(1).toLowerCase();
                word = firstCharacter + leftCharacter;
                name += word + " ";
            }
            return name.trim();
        }
    }

    // NHẬP VÀO TIỀN
    public static float inputPositiveMoney(String erroMessage2) {
        while (true) {
            float money = ScannerUtils.inputMoney(erroMessage2);
            if (money < 0) {
                System.err.print(erroMessage2);
            } else {
                return money;
            }
        }
    }

    public static float inputMoney(String errorMessage) {
        while (true) {
            try {
             float outputMoney = ScannerUtils.inputFloat(errorMessage);
                return outputMoney;
            } catch (Exception e) {
                System.err.println(errorMessage);
            }
        }
    }


}