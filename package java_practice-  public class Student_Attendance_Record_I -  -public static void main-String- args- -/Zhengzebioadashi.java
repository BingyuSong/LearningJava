package java_practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zhengzebioadashi {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("正则表达式");
		Matcher matcher = pattern.matcher("正则表达式 Hello World,正则表达式 Hello World");
		System.out.println(matcher.replaceAll("Java"));
		
		Pattern p = Pattern.compile("\\d+");
		String[] str = p.split("我的QQ是:456456我的电话是:0532214我的邮箱是:aaa@aaa.com");
		System.out.println(str[1]);
//		
//		System.out.println(Pattern.matches("\\d+", "223"));
//		System.out.println(Pattern.matches("\\d+\\[a_z]", "223aa"));
//		
//		
		Matcher m=p.matcher("22bb23"); 
		Pattern p1 = Pattern.compile("\\D+");
		Matcher M = p1.matcher("bb33an");
		
//		System.out.println("数字匹配");
//		System.out.println(m.pattern()+"返回pattern");		
//		System.out.println(m.lookingAt()+"只有匹配的字符在最前面才返回true");
//		System.out.println(m.find()+"匹配到的字符串可以在任何位置");
//		System.out.println(m.matches()+"整个字符都得匹配");
//
//		
//		System.out.println("字母匹配");
//		System.out.println(M.lookingAt());
//		System.out.println(M.find());
//		System.out.println(M.matches());
//		System.out.println(M.pattern());

		//		matches, find 和lookat是三个不同的匹配操作，其后都可以使用start（），end（），group（） 返回更多信息
		Matcher m1=p.matcher("aaa2223bb");
		m1.find();
		System.out.println(m1.start());
		System.out.println(m1.end());
		System.out.println(m1.group());
		
		Matcher m2=p.matcher("2223bb"); 
		m2.lookingAt();
		System.out.println(m2.start());
		System.out.println(m2.end());
		System.out.println(m2.group());


		Pattern p2=Pattern.compile("([a-z]+)(\\d+)"); 
		Matcher m3=p2.matcher("aaa2223bb"); 
		System.out.println(m3.matches());
		System.out.println(m3.groupCount());

		
		Pattern p4=Pattern.compile("\\d+"); 
		Matcher m4=p.matcher("我的QQ是:456456 我的电话是:0532214 我的邮箱是:aaa123@aaa.com"); 
		while(m4.find()) { 
		     System.out.println(m4.group()); 
		} 
		
        String regEx = "count(\\d+)(df)";  
        String s = "count000dfdfsdffaaaa1";  
        Pattern pat = Pattern.compile(regEx);  
        Matcher mat = pat.matcher(s);  
        System.out.println(mat.groupCount());
        if(mat.find()){
           System.out.println(mat.group());
        }
		
	}
	

}
