
package com.intel.bigdatamem;

/**
 * an interface to reclaim its memory resource.
 * 
 * @author Wang, Gang {@literal <gang1.wang@intel.com>}
 *
 */
public interface Reclaim<MRES> {

	/**
	 * reclaim specified resource.
	 * 
	 * @param mres
	 *            a resource to be reclaimed
	 *            
	 * @param size
	 *            the size of resource, it will be set as null if unknown
	 *            
	 * @return <tt>true</tt> if this resource has been reclaimed by this
	 *         callback. <tt>false</tt> if this resource needs to be claimed by
	 *         default reclaimer
	 */
	public boolean reclaim(MRES mres, Long size);
}
