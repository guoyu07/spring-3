package generator;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.api.VerboseProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * @describe:https://www.jianshu.com/u/231b43e2c05f
 * @author:yang.bo@pelerin.cn
 * @date:2018年1月23日下午1:14:36
 */
public class GeneratorTest {

	@Test
	public void testCreateCode() throws Exception {

		List<String> warnings = new ArrayList<>();
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("generator-config.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(is);
		DefaultShellCallback callback = new DefaultShellCallback(true);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		ProgressCallback progressCallback = new VerboseProgressCallback();
		myBatisGenerator.generate(progressCallback);

		for (String warning : warnings) {
			System.out.println(warning);
		}

	}
}
