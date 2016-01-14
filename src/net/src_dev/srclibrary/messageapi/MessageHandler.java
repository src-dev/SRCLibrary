/**
 * Copyright 2016 src-dev.net
 * All rights reserved.
 */

package net.src_dev.srclibrary.messageapi;

import java.util.Arrays;
import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * The MessageHandler object class.
 * Class is abstract. Must be subclassed.
 * A subclass of this is used to create and control Messages and MultiMessages.
 */
public abstract class MessageHandler {
	
	private Options options = new Options();

	private JavaPlugin plugin;
	private FileConfiguration config;
	
	/**
	 * Only constructor. This is used to set the plugin and config variables.
	 * @param plugin Should be an instance of JavaPlugin.
	 * @param config Can be any FileConfiguration instance. Used to get messages from config.
	 */
	public MessageHandler(JavaPlugin plugin, FileConfiguration config) {
		this.plugin = plugin;
		this.config = config;		
	}
	
	/**
	 * Loads all of the messages. Should only be called by child classes.
	 */
	protected abstract void load();
	
	/**
	 * Gets the Options instance for this handler instance.
	 * @return Returns the options variable.
	 */
	public Options options() {
		return options;
	}
	
	/**
	 * Retrieves a message from the config. This method is useful because it automatically passes the plugin instance to the message.
	 * @param key This is the yml key.
	 * @return Returns a new Message instance.
	 */
	public Message getConfigMessage(String key) {
		return new Message(config.getString(options.getKeyPrefix() + key)).setPlugin(plugin);
	}
	
	/**
	 * Retrieves a multimessage from the config. This method is useful because it automatically passes the plugin instance to the message.
	 * @param key This is the yml key.
	 * @return Returns a new MultiMessage instance.
	 */
	public MultiMessage getConfigMultiMessage(String key) {
		return new MultiMessage(config.getStringList(options.getKeyPrefix() + key)).setPlugin(plugin);
	}
	
	/**
	 * Identical to the getConfigMessage method except it has an option to not use the keyPrefix.
	 * @param key This is the yml key.
	 * @param useKeyPrefix Should the keyPrefix be used?
	 * @return Returns a new Message.
	 */
	public Message getConfigMessage(String key, boolean useKeyPrefix) {
		if(useKeyPrefix) return new Message(config.getString(options.getKeyPrefix() + key)).setPlugin(plugin);
		else return new Message(config.getString(key)).setPlugin(plugin);
	}
	
	/**
	 * Identical to the getConfigMultiMessage method except it has an option to not use the keyPrefix.
	 * @param key This is the yml key.
	 * @param useKeyPrefix Should the keyPrefix be used?
	 * @return Returns a new MultiMessage.
	 */
	public MultiMessage getConfigMultiMessage(String key, boolean useKeyPrefix) {
		if(useKeyPrefix) return new MultiMessage(config.getStringList(options.getKeyPrefix() + key)).setPlugin(plugin);
		else return new MultiMessage(config.getStringList(key)).setPlugin(plugin);
	}
	
	/**
	 * Creates a new Message. This method is useful because it automatically passes the plugin instance to the message.
	 * @param text The text used to create the Message.
	 * @return Returns a new Message.
	 */
	public Message createMessage(String text) {
		return new Message(text).setPlugin(plugin);
	}
	
	/**
	 * Creates a new MultiMessage. This method is useful because it automatically passes the plugin instance to the message.
	 * @param text The List used to create the MultiMessage.
	 * @return Returns a new MultiMessage.
	 */
	public MultiMessage createMultiMessage(List<String> text) {
		return new MultiMessage(text).setPlugin(plugin);
	}
	
	/**
	 * Creates a new MultiMessage. This method is useful because it automatically passes the plugin instance to the message.
	 * @param text The array used to create the MultiMessage.
	 * @return Returns a new MultiMessage.
	 */
	public MultiMessage createMultiMessage(String[] text) {
		return new MultiMessage(Arrays.asList(text)).setPlugin(plugin);
	}
	
	/**
	 * Inner Options class. Used to get/set handler options.
	 */
	public class Options{
		
		private String keyPrefix = "";
		
		/**
		 * Sets the keyPrefix.
		 * @param keyPrefix String which the keyPrefix will be set to.
		 */
		public void setKeyPrefix(String keyPrefix) {
			this.keyPrefix = keyPrefix;
		}
		
		/**
		 * Gets the keyPrefix. 
		 * @return Returns the keyPrefix.
		 */
		public String getKeyPrefix() {
			return keyPrefix;
		}
		
	}
}