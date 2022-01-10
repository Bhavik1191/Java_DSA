package popularInterviewQuestions;

public class LongestPalindromicString {

    //https://leetcode.com/problems/longest-palindromic-substring/
    public static void main(String[] args) {

        String s = "cyyoacmjwjubfkzrrbvquqkwhsxvmytmjvbborrtoiyotobzjmohpadfrvmxuagbdczsjuekjrmcwyaovpiogspbslcppxojgbfxhtsxmecgqjfuvahzpgprscjwwutwoiksegfreortttdotgxbfkisyakejihfjnrdngkwjxeituomuhmeiesctywhryqtjimwjadhhymydlsmcpycfdzrjhstxddvoqprrjufvihjcsoseltpyuaywgiocfodtylluuikkqkbrdxgjhrqiselmwnpdzdmpsvbfimnoulayqgdiavdgeiilayrafxlgxxtoqskmtixhbyjikfmsmxwribfzeffccczwdwukubopsoxliagenzwkbiveiajfirzvngverrbcwqmryvckvhpiioccmaqoxgmbwenyeyhzhliusupmrgmrcvwmdnniipvztmtklihobbekkgeopgwipihadswbqhzyxqsdgekazdtnamwzbitwfwezhhqznipalmomanbyezapgpxtjhudlcsfqondoiojkqadacnhcgwkhaxmttfebqelkjfigglxjfqegxpcawhpihrxydprdgavxjygfhgpcylpvsfcizkfbqzdnmxdgsjcekvrhesykldgptbeasktkasyuevtxrcrxmiylrlclocldmiwhuizhuaiophykxskufgjbmcmzpogpmyerzovzhqusxzrjcwgsdpcienkizutedcwrmowwolekockvyukyvmeidhjvbkoortjbemevrsquwnjoaikhbkycvvcscyamffbjyvkqkyeavtlkxyrrnsmqohyyqxzgtjdavgwpsgpjhqzttukynonbnnkuqfxgaatpilrrxhcqhfyyextrvqzktcrtrsbimuokxqtsbfkrgoiznhiysfhzspkpvrhtewthpbafmzgchqpgfsuiddjkhnwchpleibavgmuivfiorpteflholmnxdwewj";
        String ans = longestPalindrome(s);
        System.out.println("Final ans : " +ans);
    }

    private static String longestPalindrome(String s) {

        int max_count = 0;
        String ans="";
        for (int i = 0; i < s.length(); i++) {

            for (int j = i+1; j <= s.length(); j++) {
                String sub = s.substring(i,j);
                System.out.println(sub);
                StringBuilder s1 = new StringBuilder();
                s1.append(sub);

                if(sub.equalsIgnoreCase(String.valueOf(s1.reverse())))
                {
                    if(sub.length()>max_count)
                    {
                        max_count = sub.length();
                        ans = sub;
                    }
                }
            }
        }
        return ans;
    }
}
