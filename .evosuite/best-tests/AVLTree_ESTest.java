/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 17 03:38:40 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AVLTree_ESTest extends AVLTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-409));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(707);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete((-1));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert((-1));
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete(3558);
      assertEquals(2, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      assertNotNull(aVLTree_Node0);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.insert(3558);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.insert(4837);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.insert(510);
      assertEquals(3, aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals(2, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(2, aVLTree0.height());
      assertEquals(2, int0);
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.find(1446);
      assertNull(aVLTree_Node1);
      assertEquals(2, aVLTree0.height());
      
      int int1 = aVLTree0.height();
      assertEquals(2, aVLTree0.height());
      assertTrue(int1 == int0);
      assertEquals(2, int1);
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.find((-409));
      assertNotNull(aVLTree_Node2);
      assertEquals(2, aVLTree0.height());
      assertFalse(aVLTree_Node2.equals((Object)aVLTree_Node0));
      assertNotSame(aVLTree_Node2, aVLTree_Node0);
      
      // Undeclared exception!
      try { 
        aVLTree0.insert(707);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(1521);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(1, aVLTree0.height());
      assertEquals(1, int0);
      
      int int1 = aVLTree0.height();
      assertEquals(1, aVLTree0.height());
      assertTrue(int1 == int0);
      assertEquals(1, int1);
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      assertNotNull(aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert((-1));
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node1);
      assertEquals(1, aVLTree0.height());
      assertSame(aVLTree_Node1, aVLTree_Node0);
      
      aVLTree_Node0.right = aVLTree_Node1;
      assertEquals(1, aVLTree0.height());
      
      int int2 = aVLTree0.height();
      assertEquals(1, aVLTree0.height());
      assertTrue(int2 == int1);
      assertTrue(int2 == int0);
      assertEquals(1, int2);
      
      aVLTree0.insert((-1289));
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.insert(int1);
      int int3 = (-593);
      aVLTree0.delete(int3);
      aVLTree0.getBalance(aVLTree_Node0);
      AVLTree aVLTree1 = new AVLTree();
      int int4 = 0;
      AVLTree.Node aVLTree_Node2 = aVLTree1.find(int4);
      aVLTree0.getBalance(aVLTree_Node2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete((-4175));
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-4175));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete((-4175));
      assertEquals((-1), aVLTree0.height());
      
      int int0 = (-2144);
      aVLTree0.insert(1298);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert((-2144));
      assertEquals(1, aVLTree0.height());
      
      // Undeclared exception!
      try { 
        aVLTree0.delete(1298);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertNull(aVLTree_Node0);
      assertEquals((-1), aVLTree0.height());
      
      int int0 = aVLTree0.getBalance((AVLTree.Node) null);
      assertEquals((-1), aVLTree0.height());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find((-16));
      assertNull(aVLTree_Node0);
      assertEquals((-1), aVLTree0.height());
      
      int int0 = aVLTree0.getBalance((AVLTree.Node) null);
      assertEquals((-1), aVLTree0.height());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(0, aVLTree0.height());
      assertEquals(0, int0);
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      assertNotNull(aVLTree_Node0);
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.find(2162);
      assertNull(aVLTree_Node1);
      assertEquals(0, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-4969));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete(1594);
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree_Node0.height = 1594;
      assertEquals(1594, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.right;
      assertNull(aVLTree_Node1);
      
      aVLTree_Node0.left = null;
      assertEquals(1594, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.new Node(0);
      assertNotNull(aVLTree_Node2);
      assertEquals(1594, aVLTree0.height());
      assertFalse(aVLTree_Node2.equals((Object)aVLTree_Node0));
      
      aVLTree_Node0.right = aVLTree_Node2;
      assertEquals(1594, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node3 = aVLTree0.new Node((-1));
      assertNotNull(aVLTree_Node3);
      assertEquals(1594, aVLTree0.height());
      assertFalse(aVLTree_Node3.equals((Object)aVLTree_Node2));
      assertFalse(aVLTree_Node3.equals((Object)aVLTree_Node0));
      
      aVLTree_Node0.right = aVLTree_Node3;
      assertEquals(1594, aVLTree0.height());
      
      int int0 = aVLTree0.getBalance(aVLTree_Node0);
      assertEquals(1594, aVLTree0.height());
      assertFalse(aVLTree_Node0.equals((Object)aVLTree_Node3));
      assertFalse(aVLTree_Node0.equals((Object)aVLTree_Node2));
      assertEquals(1, int0);
      assertNotSame(aVLTree_Node0, aVLTree_Node3);
      assertNotSame(aVLTree_Node0, aVLTree_Node2);
      
      aVLTree0.insert(1594);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node4 = aVLTree0.find(0);
      assertNull(aVLTree_Node4);
      assertEquals(1, aVLTree0.height());
      
      int int1 = aVLTree0.height();
      assertEquals(1, aVLTree0.height());
      assertTrue(int1 == int0);
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(1893);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node1);
      assertEquals(1, aVLTree0.height());
      assertSame(aVLTree_Node1, aVLTree_Node0);
      
      aVLTree_Node0.left = aVLTree_Node1;
      assertEquals(1, aVLTree0.height());
      
      int int0 = aVLTree0.getBalance(aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
      assertEquals((-2), int0);
      assertSame(aVLTree_Node0, aVLTree_Node1);
      
      // Undeclared exception!
      aVLTree0.find(0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-409));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(691);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete((-409));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete((-1));
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(510);
      assertNull(aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(510);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert((-1));
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.insert((-1890));
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete(3558);
      assertEquals(2, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.find(0);
      assertNotNull(aVLTree_Node1);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete(691);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.insert(4837);
      assertEquals(2, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(2, aVLTree0.height());
      assertEquals(2, int0);
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.find(1446);
      assertNull(aVLTree_Node2);
      assertEquals(2, aVLTree0.height());
      
      int int1 = aVLTree0.height();
      assertEquals(2, aVLTree0.height());
      assertTrue(int1 == int0);
      assertEquals(2, int1);
      
      aVLTree0.insert(691);
      assertEquals(2, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      int int0 = 0;
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      int int1 = (-448);
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node((-448));
      assertNotNull(aVLTree_Node0);
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node1);
      assertEquals(0, aVLTree0.height());
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node0));
      assertNotSame(aVLTree_Node1, aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.find(0);
      assertNotNull(aVLTree_Node2);
      assertEquals(0, aVLTree0.height());
      assertFalse(aVLTree_Node2.equals((Object)aVLTree_Node0));
      assertSame(aVLTree_Node2, aVLTree_Node1);
      assertNotSame(aVLTree_Node2, aVLTree_Node0);
      
      aVLTree_Node0.height = 1543;
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node3 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node3);
      assertEquals(0, aVLTree0.height());
      assertFalse(aVLTree_Node3.equals((Object)aVLTree_Node0));
      assertNotSame(aVLTree_Node3, aVLTree_Node0);
      assertSame(aVLTree_Node3, aVLTree_Node1);
      assertSame(aVLTree_Node3, aVLTree_Node2);
      
      aVLTree_Node1.height = 0;
      assertEquals(0, aVLTree0.height());
      
      int int2 = (-2232);
      aVLTree0.insert((-2232));
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node4 = aVLTree0.find(471);
      assertNull(aVLTree_Node4);
      assertEquals(1, aVLTree0.height());
      
      aVLTree_Node1.right = aVLTree_Node0;
      assertEquals(1, aVLTree0.height());
      
      int int3 = (-140);
      // Undeclared exception!
      try { 
        aVLTree0.insert((-146));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-409));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(691);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete((-1));
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(510);
      assertNull(aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(510);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.insert((-1));
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete(3558);
      assertEquals(2, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.find(0);
      assertNotNull(aVLTree_Node1);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.insert(4837);
      assertEquals(2, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.find(3558);
      assertNull(aVLTree_Node2);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals(2, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(2, aVLTree0.height());
      assertEquals(2, int0);
      
      AVLTree.Node aVLTree_Node3 = aVLTree0.find(1446);
      assertNull(aVLTree_Node3);
      assertEquals(2, aVLTree0.height());
      
      int int1 = aVLTree0.height();
      assertEquals(2, aVLTree0.height());
      assertTrue(int1 == int0);
      assertEquals(2, int1);
      
      // Undeclared exception!
      try { 
        aVLTree0.insert(691);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-409));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(691);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete((-1));
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(510);
      assertNull(aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(510);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.insert((-1));
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete(3558);
      assertEquals(2, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.find(0);
      assertNotNull(aVLTree_Node1);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.insert(4837);
      assertEquals(2, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.find(3558);
      assertNull(aVLTree_Node2);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals(2, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(2, aVLTree0.height());
      assertEquals(2, int0);
      
      int int1 = aVLTree0.height();
      assertEquals(2, aVLTree0.height());
      assertTrue(int1 == int0);
      assertEquals(2, int1);
      
      // Undeclared exception!
      try { 
        aVLTree0.insert(691);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      int int0 = (-1);
      aVLTree0.insert((-1));
      assertEquals(0, aVLTree0.height());
      
      // Undeclared exception!
      try { 
        aVLTree0.insert((-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete(1495);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(1495);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete(1495);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert((-1));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert((-99));
      assertEquals(1, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(1, aVLTree0.height());
      assertEquals(1, int0);
      
      aVLTree0.delete((-1));
      assertEquals(1, aVLTree0.height());
      
      int int1 = aVLTree0.height();
      assertEquals(1, aVLTree0.height());
      assertTrue(int1 == int0);
      assertEquals(1, int1);
      
      aVLTree0.insert(1);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete(3470);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(3470);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert((-1));
      assertEquals(1, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(1, aVLTree0.height());
      assertEquals(1, int0);
      
      aVLTree0.insert(1);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete(1);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete((-4465));
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-4465));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert((-1));
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-745));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(348);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-1100));
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(32);
      assertNotNull(aVLTree_Node0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete((-1100));
      assertEquals((-1), aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(1);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete(512);
      assertEquals(0, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(1818);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete((-622));
      assertEquals(0, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(1010);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert((-1));
      assertEquals(1, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(1, aVLTree0.height());
      assertEquals(1, int0);
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertNotNull(aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-3285));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals((-1), aVLTree0.height());
      assertEquals((-1), int0);
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertNull(aVLTree_Node0);
      assertEquals((-1), aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete(586);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      assertNotNull(aVLTree_Node0);
      assertEquals(0, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find((-1));
      assertNull(aVLTree_Node0);
      assertEquals(0, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertNotNull(aVLTree0);
      assertEquals((-1), aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(1144);
      assertNull(aVLTree_Node0);
      assertEquals((-1), aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-409));
      aVLTree0.insert(659);
      aVLTree0.insert(0);
      aVLTree0.delete((-1));
      aVLTree0.find(659);
      aVLTree0.insert(3580);
      aVLTree0.insert(4837);
      aVLTree0.delete(0);
      aVLTree0.height();
      // Undeclared exception!
      try { 
        aVLTree0.insert(659);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(710);
      aVLTree0.insert((-1));
      aVLTree0.insert(510);
      aVLTree0.insert((-1890));
      aVLTree0.find(0);
      aVLTree0.delete(710);
      int int0 = aVLTree0.getBalance((AVLTree.Node) null);
      assertEquals(1, aVLTree0.height());
      assertEquals(0, int0);
  }
}
