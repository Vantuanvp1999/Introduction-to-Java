import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc");
        int n = scanner.nextInt();
        if(n<10&&n>0){
            switch(n){
                case 1:
                    System.out.println("One");
                    break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
            }
        }

        if(n<20&&n>=10){
            int donvi= n%10;
            String doc="";
            switch(donvi){
                case 0:
                    doc ="Ten";
                    break;
                case 1:
                    doc ="Eleven";
                    break;
                case 2:
                    doc ="Twelve";
                    break;
                    case 3:
                        doc ="Thirteen";
                                break;
                        case 4:
                            doc ="Fourteen";
                                    break;
                            case 5:
                                doc ="Fifteen";
                                        break;
                                case 6:
                                    doc ="Sixteen";
                                            break;
                                    case 7:
                                        doc ="Seventeen";
                                                break;
                                        case 8:
                                            doc ="Eighteen";
                                                    break;
                                            case 9:
                                                doc ="Nineteen";
                                                        break;

            }
            System.out.println(doc);
        }
        if(n>=20&&n<100){
            int donvi= n%10;
            int chuc= n/10;
            String docChuc="";
            String docDonvi="";
            switch(chuc){
                case 2:
                    docChuc ="Twenty";
                    break;
                    case 3:
                        docChuc ="Thirty";
                        break;
                        case 4:
                            docChuc ="Forty";
                            break;
                            case 5:
                                docChuc ="Fifty";
                                break;
                                case 6:
                                    docChuc ="Sixty";
                                    break;
                                    case 7:
                                        docChuc ="Seventy";
                                        break;
                                        case 8:
                                            docChuc ="Eighty";
                                            break;
                                            case 9:
                                                docChuc ="Ninety";
                                                break;
            }
            switch (donvi){
                case 0:
                    docDonvi ="";
                    break;
                    case 1:
                        docDonvi ="One";
                        break;
                        case 2:
                            docDonvi ="Two";
                            break;
                            case 3:
                                docDonvi ="Three";
                                break;
                                case 4:
                                    docDonvi ="Four";
                                    break;
                                    case 5:
                                        docDonvi ="Five";
                                        break;
                                        case 6:
                                            docDonvi ="Six";
                                            break;
                                            case 7:
                                                docDonvi ="Seven";
                                                break;
                                                case 8:
                                                    docDonvi ="Eight";
                                                    break;
                                                    case 9:
                                                        docDonvi ="Nine";
                                                        break;
            }

            System.out.println(docChuc+" "+docDonvi);
        }
        if(n<1000&&n>=100){
            int tram=n/100;
            int duChuc= n%100;
            String docTram="";
            switch(tram){
                case 1:
                    docTram ="One hundred";
                    break;
                    case 2:
                        docTram ="Two hundred";
                        break;
                        case 3:
                            docTram ="Three hundred";
                            break;
                            case 4:
                                docTram ="Four hundred";
                                break;
                                case 5:
                                    docTram ="Five hundred";
                                    break;
                                    case 6:
                                        docTram ="Six hundred";
                                        break;
                                        case 7:
                                            docTram ="Seven hundred";
                                            break;
                                            case 8:
                                                docTram ="Eight hundred";
                                                break;
                                                case 9:
                                                    docTram ="Nine hundred";
                                                    break;

            }
            if (duChuc<10){
                String docDonvi="";
                switch (duChuc){
                    case 0:
                        docDonvi ="";
                        break;
                        case 1:
                            docDonvi ="One";
                            break;
                            case 2:
                                docDonvi ="Two";
                                break;
                                case 3:
                                    docDonvi ="Three";
                                    break;
                                    case 4:
                                        docDonvi ="Four";
                                        break;
                                        case 5:
                                            docDonvi ="Five";
                                            break;
                                            case 6:
                                                docDonvi ="Six";
                                                break;
                                                case 7:
                                                    docDonvi ="Seven";
                                                    break;
                                                    case 8:
                                                        docDonvi ="Eight";
                                                        break;
                                                        case 9:
                                                            docDonvi ="Nine";
                                                            break;

                }
                System.out.println(docTram+" and "+docDonvi);
            }
            if(duChuc>=10&&duChuc<20){
                String docDonvi="";
                switch (duChuc%10){
                    case 0:
                        docDonvi ="ten";
                        break;
                        case 1:
                            docDonvi ="eleven";
                            break;
                            case 2:
                                docDonvi ="twelve";
                                break;
                                case 3:
                                    docDonvi ="thirteen";
                                    break;
                                    case 4:
                                        docDonvi ="fourteen";
                                        break;
                                        case 5:
                                            docDonvi ="five";
                                            break;
                                            case 6:
                                                docDonvi ="sixteen";
                                                break;
                                                case 7:
                                                    docDonvi ="seventeen";
                                                    break;
                                                    case 8:
                                                        docDonvi ="eighteen";
                                                        break;
                                                        case 9:
                                                            docDonvi ="nineteen";
                                                            break;

                }
                System.out.println(docTram+" and "+docDonvi);
            }
            if (duChuc>=20&&duChuc<100){
                String docDonvi="";
                String docChuc="";
                switch (duChuc/10){
                    case 2:
                        docChuc ="twenty";
                        break;
                        case 3:
                            docChuc ="thirty";
                            break;
                            case 4:
                                docChuc ="forty";
                                break;
                                case 5:
                                    docChuc ="fifty";
                                    break;
                                    case 6:
                                        docChuc ="sixty";
                                        break;
                                        case 7:
                                            docChuc ="seventy";
                                            break;
                                            case 8:
                                                docChuc ="eighty";
                                                break;
                                                case 9:
                                                    docChuc ="ninety";
                                                    break;
                }
                switch (duChuc%10){
                    case 0:
                        docDonvi ="";
                        break;
                        case 1:
                            docDonvi ="one";
                            break;
                            case 2:
                                docDonvi ="two";
                                break;
                                case 3:
                                    docDonvi ="three";
                                    break;
                                    case 4:
                                        docDonvi ="four";
                                        break;
                                        case 5:
                                            docDonvi ="five";
                                            break;
                                            case 6:
                                                docDonvi ="six";
                                                break;
                                                case 7:
                                                    docDonvi ="seven";
                                                    break;
                                                    case 8:
                                                        docDonvi ="eight";
                                                        break;
                                                        case 9:
                                                            docDonvi ="nine";
                                                            break;
                }
                System.out.println(docTram+" and "+docChuc+" "+docDonvi);
            }
        }
    }
}
