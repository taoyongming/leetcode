//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。 
//
// 示例 1: 
//
// 输入: 121
//输出: true
// 
//
// 示例 2: 
//
// 输入: -121
//输出: false
//解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3: 
//
// 输入: 10
//输出: false
//解释: 从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 进阶: 
//
// 你能不将整数转为字符串来解决这个问题吗？ 
// Related Topics 数学




//leetcode submit region begin(Prohibit modification and deletion)
class isPalindrome {

    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        String s = x+"";
        int mid = 0;
        char[] array = s.toCharArray();
        if(s.length() % 2  == 0) {
            mid = s.length() /2;
            for(int i = 0; i<s.length()-mid;i++) {
                if(array[mid-i-1] != array[mid+i]) return false;
            }
        }else {
            mid = s.length() /2 + 1;
            for(int i = 1; i<=s.length()-mid;i++) {
                if(array[mid-i-1] != array[mid-1+i]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new isPalindrome().isPalindrome(100));
    }
}
//leetcode submit region end(Prohibit modification and deletion)
