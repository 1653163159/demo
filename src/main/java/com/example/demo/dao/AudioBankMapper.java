package com.example.demo.dao;

import com.example.demo.pojo.AudioBank;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface AudioBankMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audio_bank
     *
     * @mbg.generated Sat Jan 14 11:27:56 CST 2023
     */
    @Delete({
        "delete from audio_bank",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audio_bank
     *
     * @mbg.generated Sat Jan 14 11:27:56 CST 2023
     */
    @Insert({
        "insert into audio_bank (id, type, ",
        "audio_name, audio_content)",
        "values (#{id,jdbcType=INTEGER}, #{type,jdbcType=INTEGER}, ",
        "#{audio_name,jdbcType=VARCHAR}, #{audio_content,jdbcType=LONGVARBINARY})"
    })
    int insert(AudioBank row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audio_bank
     *
     * @mbg.generated Sat Jan 14 11:27:56 CST 2023
     */
    @Select({
        "select",
        "id, type, audio_name, audio_content",
        "from audio_bank",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="audio_name", property="audio_name", jdbcType=JdbcType.VARCHAR),
        @Result(column="audio_content", property="audio_content", jdbcType=JdbcType.LONGVARBINARY)
    })
    AudioBank selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audio_bank
     *
     * @mbg.generated Sat Jan 14 11:27:56 CST 2023
     */
    @Select({
        "select",
        "id, type, audio_name, audio_content",
        "from audio_bank",
        "order by age desc,username asc"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="audio_name", property="audio_name", jdbcType=JdbcType.VARCHAR),
        @Result(column="audio_content", property="audio_content", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<AudioBank> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audio_bank
     *
     * @mbg.generated Sat Jan 14 11:27:56 CST 2023
     */
    @Update({
        "update audio_bank",
        "set type = #{type,jdbcType=INTEGER},",
          "audio_name = #{audio_name,jdbcType=VARCHAR},",
          "audio_content = #{audio_content,jdbcType=LONGVARBINARY}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AudioBank row);
}