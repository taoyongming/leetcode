//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串




//leetcode submit region begin(Prohibit modification and deletion)
class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
       if(strs == null || strs.length ==0 ) return "";
       String prefix = strs[0];
       int count = strs.length;
       for(int i=1; i<count ; i++) {
           prefix =  this.longestCommonPrefix(prefix,strs[i]);
       }
        return prefix;
    }

    private  String longestCommonPrefix(String str1, String str2) {
        int length = Math.min(str1.length(),str2.length());
        int index = 0;
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            index ++;
        }
        return str1.substring(0,index);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
