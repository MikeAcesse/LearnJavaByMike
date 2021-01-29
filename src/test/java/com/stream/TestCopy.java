package com.stream;

import object.CopyRule;
import org.junit.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/29 17:17
 */
public class TestCopy {
	@Test
	public void test1(){
		CopyRule copyRule1 =new CopyRule("c","d","e");
		CopyRule copyRule2 =new CopyRule("c","d","e");
		CopyRule copyRule3 =new CopyRule("c","d","e");
		CopyRule[] copyRules = {copyRule1,copyRule2,copyRule3};
		Arrays.stream(copyRules).forEach(copyRule->{copyRule.setSrcDir("1");
			copyRule.setBackupDir("2");
		    copyRule.setUnmonitoredDir("3");});
		System.out.println();

		List<CopyRule> copyRuleList =  Arrays.stream(copyRules).collect(Collectors.toList());
		System.out.println(copyRuleList);
	}

}
