package com.iiht.giftcard.testcases;

import org.junit.runner.RunWith;

import com.iiht.giftcard.dao.GiftCardOrderDaoSqlImpl;

@RunWith(MockitoJUnitRunner.class)
public class TestCases {
@Mock
private GiftCardOrderDaoSqlImpl giftService;
@InjectMocks
private GiftCardOrderController giftController;
private MockMvc mock;
@Test
public void testUser() throws Exception{
	this.mock.perform(get("/login")).andExpect(status().isOk()).andExpect(view().name("user"));
}
}
