package com.palmstudios.system;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public abstract class Tile
{
	
	public static final int TILE_SIZE = 32; /**< Size of a single tile (both width and height) */
	
	/** TILE TYPE CONSTANTS */
	public static final int TILE_AIR	= 0;	/**< Air tile type */
	
	public int 		type; 	/**< The type of this tile */
	public String 	name; 	/**< Name of this tile. Probably not worth bothering with */
	public boolean	solid;	/**< Will this tile block movement??? */
	
	/**
	 * Default constructor (for NULL Tile).
	 */
	public Tile()
	{
		this.type 	= TILE_AIR;
		this.solid 	= false;
		this.name 	= "NULL";
	}
	
	/**
	 * 
	 * @param type - The type of this tile (defined in Tile.java)
	 * @param solid - Will this tile allow an entity to pass through it?
	 */
	public Tile(int type, boolean solid)
	{
		this.type 	= type;
		this.solid 	= solid;
		this.name 	= "DEFAULT";
	}
	
	/**
	 * 
	 * @param type - The type of this tile (defined in Tile.java)
	 * @param solid - Will this tile allow an entity to pass through it?
	 * @param name - The name of this tile.
	 */
	public Tile(int type, boolean solid, String name)
	{
		this.type 	= type;
		this.solid 	= solid;
		this.name 	= name;
	}
	
	/**
	 * Draw this tile.
	 */
	public abstract void draw();
}