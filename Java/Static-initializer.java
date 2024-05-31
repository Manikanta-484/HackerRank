/* If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.*/



static Scanner sc = new Scanner(System.in);
static int B = sc.nextInt();
static int H= sc.nextInt();
static boolean flag;
static{
    try{
        if(B>0&&H>0){
            flag=true;
        }
        else{
        throw new Exception("Breadth and height must be positive");
        }
        }catch (Exception e){
            System.out.println(e);
        }
    }

