package com.sbt.javaschool.addfriend.test;

import com.sbt.javaschool.addfriend.IAddFriend;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AddFriendTest {
    @Mock
    private IAddFriend addFriends;
    @Test
    public void testAdd()  {
        when(addFriends.add()).thenReturn(true);
        assertEquals(true,addFriends.add());
    }

}
