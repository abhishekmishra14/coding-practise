package codingpractise.datastructure;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

	BinarySearchTree object;

	@BeforeEach
	void setUp() throws Exception {
		object = new BinarySearchTree();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testInsert() {
		object.insert(10);
		object.insert(15);
		object.insert(8);
		object.insert(5);
		object.insert(9);
		object.insert(13);
		object.insert(22);
		assertEquals(10, object.root.getData(), "Root Node data is not correct");
		assertEquals(8, object.root.getLeft().getData(), "Left Node data is not correct");
		assertEquals(15, object.root.getRight().getData(), "Right Node data is not correct");
		object.display(object.root);
	}

	@Test
	void testSearchRootNodeWhenTreeIsEmpty() {
		boolean isNodeNotFound = object.search(10);
		assertFalse("Root Node not found:", isNodeNotFound);
	}

	@Test
	void testSearchRootNodeWhenTreeIsNotEmpty() {
		object.insert(10);
		boolean isNodeFound = object.search(10);
		assertTrue("Root Node found:", isNodeFound);
	}

	@Test
	void testSearchLeftChildNodeWhenTreeIsNotEmpty() {
		object.insert(10);
		object.insert(15);
		object.insert(8);
		boolean isNodeFound = object.search(8);
		assertTrue("Left Child Node found:", isNodeFound);
	}

	@Test
	void testSearchRightChildNodeWhenTreeIsNotEmpty() {
		object.insert(10);
		object.insert(15);
		object.insert(8);
		boolean isNodeFound = object.search(15);
		assertTrue("Right Child Node found:", isNodeFound);
	}

	@Test
	void testSearchNoMatchingNodeWhenTreeIsNotEmpty() {
		object.insert(10);
		object.insert(15);
		object.insert(8);
		boolean isNodeFound = object.search(20);
		assertFalse("Matching Node found:", isNodeFound);
	}

	// @Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testTraverseDFSPreOrder() {
		object.insert(10);
		object.insert(15);
		object.insert(8);
		object.insert(5);
		object.insert(9);
		object.insert(13);
		object.insert(22);
		object.traverseDFSPreOrder(object.root);

	}

	@Test
	void testTraverseDFSInOrder() {
		object.insert(10);
		object.insert(15);
		object.insert(8);
		object.insert(5);
		object.insert(9);
		object.insert(13);
		object.insert(22);
		object.traverseDFSInOrder(object.root);

	}

	@Test
	void testTraverseDFSPostOrder() {
		object.insert(10);
		object.insert(15);
		object.insert(8);
		object.insert(5);
		object.insert(9);
		object.insert(13);
		object.insert(22);
		object.traverseDFSPostOrder(object.root);

	}

	@Test
	void testTraverseBFS() {

	}
}
