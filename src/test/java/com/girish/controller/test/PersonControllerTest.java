package com.girish.controller.test;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonControllerTest {
	
	private MockMvc mockMvc;	
	
	@Autowired
	private WebApplicationContext context;	
	
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();		
	}
	
	
	@Test
	 public void updatePersonTest() throws Exception{
		
		
		String jsonString = "{\n"+
				"\"personId\":2,\n"+
                "\"firstName\":\"mahesh009\",\n"+
	            "\"lastName\":\"kumar009\",\n"+
                "\"age\":\"45\"\n"+
	            "}"	;

	 RequestBuilder  requestBuilder = MockMvcRequestBuilders.put("/updateperson")
			 												.contentType(MediaType.APPLICATION_JSON)
				                                            .content(jsonString);                            

	 MvcResult result = (MvcResult) mockMvc.perform(requestBuilder)
			                               .andDo(MockMvcResultHandlers.print())
	                                       .andExpect(MockMvcResultMatchers.status().isOk())
	                                       .andReturn();
	 String responseData = result.getResponse().getContentAsString();
	  System.out.println("edit>>responseData>>"+responseData);
		//Assert.assertEquals("ACCEPTED", responseData);
	  

	}
	
	@Ignore
	@Test
	 public void deletePersnoneTest() throws Exception{
	 RequestBuilder  requestBuilder = MockMvcRequestBuilders.delete("/delete/{id}", 9)
			 												.contentType(MediaType.APPLICATION_JSON);
	 MvcResult result = (MvcResult) mockMvc.perform(requestBuilder)
			                               .andDo(MockMvcResultHandlers.print())
	                                       .andExpect(MockMvcResultMatchers.status().isOk())
	                                       .andReturn();
	 String responseData = result.getResponse().getContentAsString();
	  System.out.println("delete>>responseData>>"+responseData);
		//Assert.assertEquals("NO_CONTENT", responseData);

	}
	
	
	@Test
	 public void getAllUsersTest() throws Exception{
	 RequestBuilder  requestBuilder = MockMvcRequestBuilders.get("/personbyid/10")
			 												.contentType(MediaType.APPLICATION_JSON);
	 MvcResult result = (MvcResult) mockMvc.perform(requestBuilder)
			                               .andDo(MockMvcResultHandlers.print())
	                                       .andExpect(MockMvcResultMatchers.status().isOk()) .andReturn(); String
	  responseData = result.getResponse().getContentAsString();
	  System.out.println("getAllUsersTest>>responseData>>"+responseData);
	}
	
	
	
	
	@Test(timeout = 1000)
	public void getAllPersonTest() throws Exception{
	 RequestBuilder  requestBuilder = MockMvcRequestBuilders.get("/getallpersons")
			 												.contentType(MediaType.APPLICATION_JSON);
	 MvcResult result = (MvcResult) mockMvc.perform(requestBuilder)
			                               .andDo(MockMvcResultHandlers.print())
	                                       .andExpect(MockMvcResultMatchers.status().isOk()) .andReturn(); String
	  responseData = result.getResponse().getContentAsString();
	  System.out.println("getAllPersonTest>>responseData>>"+responseData);
	}
	 
	
	@Test
	public void insertPersonTest()  throws Exception{
		
		String jsonString = "{\n"+
		                    "\"firstName\":\"geetha\",\n"+
				            "\"lastName\":\"anjali\",\n"+
		                    "\"age\":\"32\"\n"+
				            "}"	;
		
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
