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
		text = "";
	}
	public Message(String text){
		this.text = text;
	}
		
	
	
	public void setText(String text){
		this.text = text;
	}
	public String getText(){
		return text;
	}
	public void color(){
		text = ChatColor.translateAlternateColorCodes('&', text);
	}
	public void color(char alternateColorCodeChar){
		text = ChatColor.translateAlternateColorCodes(alternateColorCodeChar, text);
	}
	public void replace(HashMap<String, String> replacementMap){
		for(Entry<String, String> entry:replacementMap.entrySet()){
			text = text.replace(entry.getKey(), entry.getValue());
		}
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
	public void concat(String str){
		text = text.concat(str);
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
	public void replace(char oldChar, char newChar){
		text = text.replace(oldChar, newChar);
	}
	public void replace(CharSequence target, CharSequence replacement){
		text = text.replace(target, replacement);
	}
	public void replaceAll(String regex, String replacement){
		text = text.replaceAll(regex, replacement);
	}
	public void replaceFirst(String regex, String replacement){
		text = text.replaceFirst(regex, replacement);
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
	public void toLowerCase(){
		text = text.toLowerCase();
	}
	public void toLowerCase(Locale locale){
		text = text.toLowerCase(locale);
	}
	public String toString(){
		return text;
	}
	public void toUpperCase(){
		text = text.toUpperCase();
	}
	public void toUpperCase(Locale locale){
		text = text.toUpperCase(locale);
	}
	public void trim(){
		text = text.trim();
	}
}
