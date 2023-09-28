package kr.min.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration //서블릿컨테이너가 만들어짐 
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class BoardControllerTest {

	@Autowired
	private WebApplicationContext ctx; //Spring Container메모리공간을 ctx이 받음 
	
	//가상의 서버환경을 만들어야함
	private MockMvc mockMvc; //가상의 MVC환경 ~ 
	
	@Before //@Test보다 먼저 실행됨
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build(); //가상의 MVC환경"서버(=톰켓)"을 만들어준다.
		
	}
	
	@Test
	public void testList() throws Exception{
		log.info(
				//컨트롤러에게 요청 perform
				mockMvc.perform(MockMvcRequestBuilders.get("/board/list"))
				//결과를 받음
				.andReturn()
				.getModelAndView().getModelMap()
				);
	}
	
	
	
}
