package io.designpattern.demos.builderpattern;


/**
 * 创建者
 * @author Administrator
 * @version 1.0
 * @created 24-����-2017 10:05:08
 */
public interface Builder {

	/**
	 * 构建门
	 * @return 门材质
	 */
	public String buildDoor();

	/**
	 * 构建墙壁
	 * @return 墙壁材质
	 */
	public String buildWall();

	/**
	 * 构建窗户
	 * @return 窗户材质
	 */
	public String buildWindow();

	/**
	 * 获取房子
	 * @return 房子实体
	 */
	public House getHouse();

}