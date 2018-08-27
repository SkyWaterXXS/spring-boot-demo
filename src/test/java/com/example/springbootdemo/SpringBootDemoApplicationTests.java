package com.example.springbootdemo;

import com.example.springbootdemo.datasource.mapper.InventoryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

	@Resource
	private InventoryMapper inventoryMapper;

	@Test
	public void test1() {
		ThreadFactory threadFactory = Executors.defaultThreadFactory();
		// creating the ThreadPoolExecutor
		ThreadPoolExecutor executorPool = new ThreadPoolExecutor(10, 100, 3, TimeUnit.SECONDS, new LinkedBlockingQueue<>(),
				threadFactory);

		executorPool.allowCoreThreadTimeOut(true);



		for(int i=0;i<10000;i++) {
			executorPool.execute(() -> {
				inventoryMapper.update();
			});
		}


		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
