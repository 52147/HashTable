/**
 * - We discussed the binary search tree, which allows various operations on a set of elements.
 * - In this chapter we discuss the hash table,
 *   which supports only a subset of the operations allowed by binary search trees.
 *   
 * - The implementation of hash tables is frequently called hashing,
 *   and it performs insertions, deletions, and finds in constant average time.
 *   
 * - Unlike with the binary search tree, the average-case running time of hash table operation is based on statistical properties
 *   rather than the expectation of random-looking input.
 * - This improvement is obtained at the expense of a loss of ordering information among elements:
 *   
 *   - Operations such as findMin and findMax and the printing of an entire table in sorted order in linear time are not supported.
 * 
 * - Consequently, the hash table and binary search tree have some what different uses and performance properties.
 * 
 *  
 * = basic ideas =
 * 
 * - The hash table supports the retrieval or deletion of any named item.
 * - We want to be able to support the basic operations in constant time,
 *   as for the stack and queue.
 *   - Because the accessed are much less restricted, this support seems like an impossible goal.
 *   - That is, surely when the size of the set increases, searches in the set should take longer.
 *   - However, that is not necessarily the case.
 *   
 * - Suppose that all the items we are dealing with are small nonnegative integers,
 *   ranging from 0 to 65535.
 * - We can use a simply array to implement each operation as follows.
 *   - First, we initialize an array a that is indexed from 0 to 65535 with all 0s.
 *     
 *   
 * 
 *
 */
public class HashSet {

}
