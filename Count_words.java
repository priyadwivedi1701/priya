class length {
    public static void main(String[] args){
        String a="  hello   student are hello";
        a=a.trim();
        int c=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==' ' && a.charAt(i+1)!=' '){
                c++;
            }
        }System.out.println("words are:"+(c+1));

    }
}
