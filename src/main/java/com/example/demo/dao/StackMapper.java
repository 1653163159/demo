package com.example.demo.dao;

import com.example.demo.pojo.Stack;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface StackMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stack
     *
     * @mbg.generated Tue Feb 28 10:15:10 CST 2023
     */
    @Delete({
            "delete from stack",
            "where chaptername = #{chaptername,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String chaptername);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stack
     *
     * @mbg.generated Tue Feb 28 10:15:10 CST 2023
     */
    @Insert({
            "insert into stack (chaptername, bookname, ",
            "content, pinyin, ",
            "level)",
            "values (#{chaptername,jdbcType=VARCHAR}, #{bookname,jdbcType=VARCHAR}, ",
            "#{content,jdbcType=VARCHAR}, #{pinyin,jdbcType=VARCHAR}, ",
            "#{level,jdbcType=VARCHAR})"
    })
    int insert(Stack row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stack
     *
     * @mbg.generated Tue Feb 28 10:15:10 CST 2023
     */
    @Select({
            "select",
            "chaptername, bookname, content, pinyin, level",
            "from stack",
            "where chaptername = #{chaptername,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "chaptername", property = "chaptername", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "bookname", property = "bookname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "content", property = "content", jdbcType = JdbcType.VARCHAR),
            @Result(column = "pinyin", property = "pinyin", jdbcType = JdbcType.VARCHAR),
            @Result(column = "level", property = "level", jdbcType = JdbcType.VARCHAR)
    })
    Stack selectByPrimaryKey(String chaptername);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stack
     *
     * @mbg.generated Tue Feb 28 10:15:10 CST 2023
     */
    @Select({
            "select",
            "chaptername, bookname, content, pinyin, level",
            "from stack",
            "order by age desc,username asc"
    })
    @Results({
            @Result(column = "chaptername", property = "chaptername", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "bookname", property = "bookname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "content", property = "content", jdbcType = JdbcType.VARCHAR),
            @Result(column = "pinyin", property = "pinyin", jdbcType = JdbcType.VARCHAR),
            @Result(column = "level", property = "level", jdbcType = JdbcType.VARCHAR)
    })
    List<Stack> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stack
     *
     * @mbg.generated Tue Feb 28 10:15:10 CST 2023
     */
    @Update({
            "update stack",
            "set bookname = #{bookname,jdbcType=VARCHAR},",
            "content = #{content,jdbcType=VARCHAR},",
            "pinyin = #{pinyin,jdbcType=VARCHAR},",
            "level = #{level,jdbcType=VARCHAR}",
            "where chaptername = #{chaptername,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Stack row);

    @Select({
            "select distinct",
            "bookname",
            "from stack",
            "order by age desc,username asc"
    })
    @Results({
            @Result(column = "bookname", property = "bookname", jdbcType = JdbcType.VARCHAR),
    })
    List<String> selectAllBookName();

    @Select({
            "select distinct",
            "bookname",
            "from stack",
            "where level = #{level,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "bookname", property = "bookname", jdbcType = JdbcType.VARCHAR),
    })
    List<String> selectBookNameByLevel(String level);

    @Select({
            "select",
            "chaptername, bookname, content, pinyin, level",
            "from stack",
            "where bookname = #{bookName,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "chaptername", property = "chaptername", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "bookname", property = "bookname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "content", property = "content", jdbcType = JdbcType.VARCHAR),
            @Result(column = "pinyin", property = "pinyin", jdbcType = JdbcType.VARCHAR),
            @Result(column = "level", property = "level", jdbcType = JdbcType.VARCHAR)
    })
    List<Stack> selectBookChapter(String bookName);


}