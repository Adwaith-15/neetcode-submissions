class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> em = new HashSet<>();
        for(int i=0;i<emails.length;i++){
            String[] parts=emails[i].split("@");
            String local = parts[0].replace(".","");
            String domain= parts[1];
            if(local.contains("+")){
                local=local.substring(0,local.indexOf("+"));
            }
            String result=local+"@"+domain;
            em.add(result);
        }
        return em.size();
    }
}