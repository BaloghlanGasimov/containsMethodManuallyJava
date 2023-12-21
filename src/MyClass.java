public class MyClass {

    public String soz;

    public boolean myContain(String word){

        char[] stArr = soz.toCharArray();
        char[] stWord = word.toCharArray();
        boolean isReturn =false;

        for(int i=0;i<stArr.length;i++){
            int j=0;

            if(stWord[j]==stArr[i]){
                int temp = i;

                for(int k =0;k<stWord.length;k++){
                    if(temp< stArr.length){

                        //System.out.println("Bele qaldi:  "+stArr[temp]);
                        if(stWord[k]==stArr[temp]){
                            isReturn=true;
                        }else {
                            isReturn=false;

                          //  System.out.println("alinmadi qaqas");
                            break;

                        }
                        //System.out.println("burada geldi");
                    }else {
                        return false;
                    }
                    //System.out.println("temp:: "+temp);
                    //System.out.println("stWord::"+stWord[k]+"  k:"+k);
                    //System.out.println("stArr::"+stArr[temp]+"  temp:"+temp);
                    temp++;
                }
                //j++;

                if(isReturn){
                    return isReturn;
                }
            }
        }
        return isReturn;
    }
}
