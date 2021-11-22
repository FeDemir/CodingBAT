package Day59_exceptions;

public class Recap {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println("nums[2] = " + nums[2]);
        try{
            System.out.println("nums[10] = " + nums[10]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("nums[10] is not found!");
            System.out.println("nums[1] = " + nums[1]);
        } finally {
            System.out.println("DONE");
        }
        try{
            //System.out.println(10/0);
            Thread.sleep(1000);

        } catch (ArithmeticException e){
            System.out.println("Handled in Arithmetic exception");
        } catch (RuntimeException e){
            System.out.println("Handled in runtime block");
        }catch (Exception e){
            System.out.println("Handled generally");
        }
        finally {
            System.out.println("End of program");
        }

    }
}
