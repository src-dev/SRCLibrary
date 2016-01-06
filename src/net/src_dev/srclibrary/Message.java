package net.src_dev.srclibrary;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Message {
	private String text;
	public Message(){
		setText("");
	}
	public Message(String text){
		setText(text);
	}
		
	
	
	public Message setText(String text){
		this.text = text;
		return this;
	}
	public String getText(){
		return text;
	}
	public Message color(){
		text = ChatColor.translateAlternateColorCodes('&', text);
		return this;
	}
	public Message color(char alternateColorCodeChar){
		text = ChatColor.translateAlternateColorCodes(alternateColorCodeChar, text);
		return this;
	}
	public Message replace(HashMap<String, String> replacementMap){
		for(Entry<String, String> entry:replacementMap.entrySet()){
			text = text.replace(entry.getKey(), entry.getValue());
		}
		return this;
	}
	public void send(CommandSender sender){
		sender.sendMessage(text);
	}
	public void send(Player player){
		player.sendMessage(text);
	}
	
		
	
	public char charAt(int index){
		return text.charAt(index);
	}
	public int codePointAt(int index){
		return text.codePointAt(index);
	}
	public int codePointBefore(int index){
		return text.codePointBefore(index);
	}
	public int codePointCount(int beginIndex, int endIndex){
		return text.codePointCount(beginIndex, endIndex);
	}
	public int compareTo(String anotherString){
		return text.compareTo(anotherString);
	}
	public int compareToIgnoreCase(String str){
		return text.compareToIgnoreCase(str);
	}
	public Message concat(String str){
		text = text.concat(str);
		return this;
	}
	public boolean contains(CharSequence s){
		return text.contains(s);
	}
	public boolean contentEquals(CharSequence cs){
		return text.contentEquals(cs);
	}
	public boolean contentEquals(StringBuffer sb){
		return text.contentEquals(sb);
	}
	public boolean endsWith(String suffix){
		return text.endsWith(suffix);
	}
	public boolean equals(Object anObject){
		return text.equals(anObject);
	}
	public boolean equalsIgnoreCase(String anotherString){
		return text.equalsIgnoreCase(anotherString);
	}
	public byte[] getBytes(){
		return text.getBytes();
	}
	public byte[] getBytes(Charset charset){
		return text.getBytes(charset);
	}
	public byte[] getBytes(String charsetName) throws UnsupportedEncodingException{
		return text.getBytes(charsetName);
	}
	public void getChars(int srcBegin, int srcEnd, char[] dat, int dstBegin){
		text.getChars(srcBegin, srcEnd, dat, dstBegin);
	}
	public int hashCode(){
		return text.hashCode();
	}
	public int indexOf(int ch){
		return text.indexOf(ch);
	}
	public int indexOf(int ch, int fromIndex){
		return text.indexOf(ch, fromIndex);
	}
	public int indexOf(String str){
		return text.indexOf(str);
	}
	public int indexOf(String str, int fromIndex){
		return text.indexOf(str, fromIndex);
	}
	public String intern(){
		return text.intern();
	}
	public boolean isEmpty(){
		return text.isEmpty();
	}
	public int lastIndexOf(int ch){
		return text.lastIndexOf(ch);
	}
	public int lastIndexOf(int ch, int fromIndex){
		return text.lastIndexOf(ch, fromIndex);
	}
	public int lastIndexOf(String str){
		return text.lastIndexOf(str);
	}
	public int lastIndexOf(String str, int fromIndex){
		return text.lastIndexOf(str, fromIndex);
	}
	public int length(){
		return text.length();
	}
	public boolean matches(String regex){
		return text.matches(regex);
	}
	public int offsetByCodePoints(int index, int codePointOffset){
		return text.offsetByCodePoints(index, codePointOffset);
	}
	public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len){
		return text.regionMatches(ignoreCase, toffset, other, ooffset, len);
	}
	public boolean regionMatches(int toffset, String other, int ooffset, int len){
		return text.regionMatches(toffset, other, ooffset, len);
	}
	public Message replace(char oldChar, char newChar){
		text = text.replace(oldChar, newChar);
		return this;
	}
	public Message replace(CharSequence target, CharSequence replacement){
		text = text.replace(target, replacement);
		return this;
	}
	public Message replaceAll(String regex, String replacement){
		text = text.replaceAll(regex, replacement);
		return this;
	}
	public Message replaceFirst(String regex, String replacement){
		text = text.replaceFirst(regex, replacement);
		return this;
	}	
	public String[] split(String regex){
		return text.split(regex);
	}
	public String[] split(String regex, int limit){
		return text.split(regex, limit);
	}
	public boolean startsWith(String prefix){
		return text.startsWith(prefix);
	}
	public boolean startsWith(String prefix, int toffset){
		return text.startsWith(prefix, toffset);
	}
	public CharSequence subSequence(int beginIndex, int endIndex){
		return text.subSequence(beginIndex, endIndex);
	}
	public String substring(int beginIndex){
		return text.substring(beginIndex);
	}
	public String substring(int beginIndex, int endIndex){
		return text.substring(beginIndex, endIndex);
	}
	public char[] toCharArray(){
		return text.toCharArray();
	}	
	public Message toLowerCase(){
		text = text.toLowerCase();
		return this;
	}
	public Message toLowerCase(Locale locale){
		text = text.toLowerCase(locale);
		return this;
	}
	public String toString(){
		return text;
	}
	public Message toUpperCase(){
		text = text.toUpperCase();
		return this;
	}
	public Message toUpperCase(Locale locale){
		text = text.toUpperCase(locale);
		return this;
	}
	public Message trim(){
		text = text.trim();
		return this;
	}
}
