package org.section8.methods;

public class Method_2_Arguments {
    //Arguments can be passed to methods in Java to provide inputs.
    public static void main(String[] args) {
        System.out.println("Arguments are values passed to a method when it is called. \n" +
                           "Methods can accept fixed parameters based on the method signature.");

        System.out.println("\n1. Passing Regular Arguments");
        regularArguments("Ram",5);

        System.out.println("\n2. Variable Arguments (Varargs)");
        variableArgs("dataType",1,2,3,4,5,6,7,8);

        System.out.println("\n3. Command-Line Arguments");
                System.out.println("  These are passed to main methods as String[], when running the programs from the terminal");
                System.out.println("  Number of args: "+args.length);
                for(String arg: args){
                    System.out.print("  Args: "+ arg);
                }
                //To run command-Line arguments : goto Run>edit Configurations.
                // select configuration created for Method_2_Arguments.main().
                // Find Program Arguments field and add arguments separated by spaces, ex:arg1 arg2 arg3
                commandLineArgsUses();

        System.out.println("\n4. Parameter Passing mechanism");
        System.out.println("  java uses pass by value, For primitive ,the actual value is passed \n" +
                            "  for objects,the reference(memory address is passed, but reference itself is passed by value");

        System.out.println("\n 4.1. Primitive as Parameter");
              int num=5;
              pass_by_ValuePri(num);
              System.out.println(" Value 5 primitive parameter passed to method, after method call :"+num+ " Original value remain same ");
        System.out.println(" 4.2. Object as Parameter");
              int[] arr={1,2,3,4};
              pass_by_ValueObj(arr); // Array reference is passed by value
              System.out.println(" Array value 1,2,3,4 Object parameter ,after method call a[0]:"+ arr[0]);

    }

    static void regularArguments(String name,int age){
        System.out.println("Hello"+name+", you are "+age+"years old");
    }

    static void variableArgs(String datatype,int... numbers){
        System.out.println("  Allows methods to accept zero or more arguments of the same type, using .... " );
        System.out.println("  "+ datatype +"... it must be Last Parameter in method signature");
        for (int num:numbers){
            System.out.print("  "+num+" " );
        }
        System.out.println(" ");
    }

    // Method to display uses of command-line arguments
    static void commandLineArgsUses() {
        System.out.println("**Command-Line Arguments Use Cases**\n");

        System.out.println("3.1. Script or Automation Tools:");
        System.out.println("   Use Case: Running scripts or programs with different inputs.");
        System.out.println("   Example: java FileProcessor input.txt output.txt");
        System.out.println("   Description: 'input.txt' and 'output.txt' are arguments specifying files to process.\n");

        System.out.println("3.2. Configurable Applications:");
        System.out.println("   Use Case: Providing runtime configurations like debug mode, environment, or ports.");
        System.out.println("   Example: java ServerApp --port 8080 --debug true");
        System.out.println("   Description: The app runs on port 8080 and enables debugging.\n");

        System.out.println("3.3. Build and Deployment Pipelines:");
        System.out.println("   Use Case: Automating tasks in DevOps or CI/CD pipelines.");
        System.out.println("   Example: java BuildTool --env production --deploy yes");
        System.out.println("   Description: Deploys the application to a production environment.\n");

        System.out.println("3.4. Data Analysis and Batch Processing:");
        System.out.println("   Use Case: Passing data files or parameters for batch jobs.");
        System.out.println("   Example: java DataAnalyzer dataset.csv --columns name,age");
        System.out.println("   Description: Processes 'dataset.csv' file for specific columns.\n");
    }

    static void pass_by_ValuePri(int num){
        num =10; // This change is local to the method  primitive parameter
    }

    static void pass_by_ValueObj(int[] arr){
        arr[0] =10;
    }

}
