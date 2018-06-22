<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.io.PrintWriter" %>
	<table align="center" style="width:90%" border="1">
		<thread>
			<tr>
				<th style="background-color:#fafafa; text-align: center; font-size: 8;">노래 명</th>
				<th style="background-color:#fafafa; text-align: center;">아티스트 명</th>
				<th style="background-color:#fafafa; text-align: center;">장르 명</th>
				<th style="background-color:#fafafa; text-align: center;">뮤직</th>
				<th style="background-color:#fafafa; text-align: center;">악보</th>
				<th style="background-color:#fafafa; text-align: center;">뮤직비디오</th>
			</tr>
		</thread>
  		<c:forEach items="${requestScope.songList}" var="songListAll">
  			<tr>
  				<td style="font-weight:bold" width="35%">${songListAll.songName}</td>
  				<td style="font-weight:bold" width="15%">${songListAll.artist}</td>
  				<td style="font-weight:bold" width="10%">${songListAll.genre}</td>
  				<td style="font-weight:bold" width="20%">
  					<c:set var="music" value="${songListAll.music}" />
  					<c:choose>
       					<c:when test="${music==' '}">
           					등록된 음악이 없습니다.
      					 </c:when>
       					<c:when test="${music!=' '}">
           					<audio controls><source src="music/${songListAll.music}" type="audio/mpeg"></audio>
      					</c:when>
   					</c:choose>
   				</td>
  				<td style="font-weight:bold" width="10%">
  					<c:set var="score" value="${songListAll.score}" />
  					<c:choose>
       					<c:when test="${score==' '}">
           					악보 없음
      					 </c:when>
       					<c:when test="${score!=' '}">
           					<a href="score/${songListAll.score}"><img src="images/score.png"height=8% width=20%></a>
      					</c:when>
   					</c:choose> 
   				</td>
  				<td style="font-weight:bold" width="10%"><a href="${songListAll.video}" target="_blank"><img src="images/video.png" height=8% width=20%></a></td>
  			</tr>
  		</c:forEach>
	</table> 