package com.girish.controller.test;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(Parameterized.class)
@SpringBootTest
public class PersonControllerParmaeterTest {
	
    private MockMvc mockMvc;
    
    private TestContextManager  testContextManager;
	
	@Autowired
	private WebApplicationContext context;	
	
	@Parameter(value=0)
	public String jsonString;
	
	@Before
	public void setUp() throws Exception {
		this.testContextManager = new TestContextManager(getClass());
        this.testContextManager.prepareTestInstance(this);

		
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();		
	}
	
    @Parameters
    public static Collection<String> data() {
    	
    	String jsonString1 = "{\n"+
                "\"firstName\":\"tulasi\",\n"+
	            "\"lastName\":\"ram\",\n"+
                "\"age\":\"50\"\n"+
	            "}"	;

    	String jsonString2 = "{\n"+
                "\"firstName\":\"chaitu\",\n"+
	            "\"lastName\":\"shakti\",\n"+
                "\"age\":\"19\"\n"+
	            "}"	;

        Collection<String> params = new ArrayList<String>();
        params.add(jsonString1);
        params.add(jsonString2);
 
        return params;
    }
    
    @Test
	public void insertPersonTest()  throws Exception{
		
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/insertperson")
				                                              .contentType(MediaType.APPLICATION_JSON)
				                                              .content(jsonString);                            
				                                              
		MvcResult result = (MvcResult) mockMvc.perform(requestBuilder)
				                              .andDo(MockMvcResultHandlers.print())
				                              .andExpect(MockMvcResultMatchers.status().isOk())
				                              .andReturn();
		String responseData = result.getResponse().getContentAsString();
		System.out.println("insertPersonTest>>responseData>>"+responseData);
		//Assert.assertEquals("CREATED", responseData);
	}
	

	

}
