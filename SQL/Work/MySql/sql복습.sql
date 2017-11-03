-- @@@@@@@@@@
-- 미션 1
-- @@@@@@@@@@
-- 1. emp 테이블에서 직원의 이름(enam), 급여(sal)와 입사일(hiredate)만을 출력하는 select  
-- 문을 작성하시오. 
select ename, sal, hiredate from emp;

-- 2. emp 테이블에서 이름(ename)에 "기"를 포함하는 직원이나 
-- 급여(sal)가 250이거나 또는 300이거나 또는 500인 직원들을 출력하는 select문을 작성하시오.
select * from emp 
where ename like '%기%' or sal in(250, 300, 500);


-- 3. emp 테이블에서 직급(job)이 '사원'이 아닌 직원만 출력하는 select 문을 작성하시오.
select * from emp
where job != '사원';


-- 5. emp 테이블에서 영업부(deptno=30) 소속의 과장 송혜교의 연봉(sal)을 700으로, 커미션(comm)을 null로 
-- 수정하는 update문을 작성하시오.
update emp 
set sal= 700, comm= null
where ename = '송혜교'

-- 6. emp 테이블에서 영업부(deptno=30) 소속의 과장 송혜교를 삭제하는 delete문을 작성하시오.
delete from emp
where ename = '송혜교'


-- 7. inner join을 사용하여 교집합을 구하시오. 
-- GROUP_STAR와 SINGLE_STAR 테이블에서 양쪽 모두 들어 있는 데이터를 출력하시오. 
-- 조인시 사용되는 컬럼: GROUP_STAR.name, SINGLE_STAR.nickname

-- 8. left join을 사용하여 차집합 구하기. 
-- GROUP_STAR와 SINGLE_STAR 테이블에서 GROUP_STAR 테이블에만 존재하는 데이터를 출력하시오. 
-- 조인시 사용되는 컬럼: GROUP_STAR.name, SINGLE_STAR.nickname

-- 9. 부서번호(deptno)가 10, 20, 30인 부서중에서 부서별 급여평균이 500이상인 
-- 부서번호(deptno), 평균급여, 급여합계, 최대급여, 최소급여 , 부서별사원수를 
-- 부서번호 오름차순으로 정렬하여 출력하시오. 

-- 10. 서브쿼리를 이용하여 emp 테이블에서 가장 최근에 입사한 직원의 입사일(hiredate)과 이름(ename)을 구하시오.

-- 11. 서브 쿼리를 사용하여 dept 테이블에서 31번 부서의 부서의 위치(loc)를 40번 부서의 위치(loc)로 바꾸시오. 
-- MySQL에서 서브쿼리를 이용한 update는 불가. Oracle은 가능

-- 12. emp 테이블에 아이린를 추가하시오. 
-- 추가할 empno를 구할 때는 서브쿼리를 사용하도록 한다.
-- MySQL에서 서브쿼리를 이용한 insert는 불가. Oracle은 가능

-- 13. emp 테이블에 강민경을 추가하시오. 
-- 추가할 empno를 구할 때는 sql 변수를 사용하도록 한다.
-- MySQL에서만 SQL 변수를 이용한 insert 가능. Oracle은 pl-sql을 사용해야 가능.

-- 14. 인천에서 근무하는 직원을 출력하시오.

-- 15. 급여(sal)가 500이상인 직원만 급여를 10% 인상하도록 수정하시오.


-- @@@@@@@@@@
-- 미션 2
-- @@@@@@@@@@
-- 1. 경리부서에 근무하는 사원의 이름과 입사일을 출력하는 SQL문을 작성하시오.. 3개. 
select * from dept where dname = '경리부';
select ename 이름, hiredate 입사일, udf_ipconfig()  from emp where deptno = (select deptno from dept where dname = '경리부');

-- 2. 인천에서 근무하는 사원의 이름, 입사일, 급여를 출력하는 SQL문을 작성하시오.. 3개. 조인
select * from dept where loc = '인천';
select * from emp where deptno in (20,21);
select ename, hiredate, sal , udf_ipconfig() from emp where deptno in (select deptno from dept where loc = '인천');

-- 3. 인천에서 근무하는 직원의 수를 출력하는 SQL문을 작성하시오.. 6개
select * from dept where loc = '인천';

select count(*), udf_ipconfig() from emp where deptno in (select deptno from dept where loc = '인천');
-- 4. 직급(emp.job)이 과장인 직원의 이름(emp.ename), 부서명(dept.dname)을 출력하는 SQL문을 작성하시오.. 3개
select emp.ename, dept.dname ,  udf_ipconfig()
from emp inner join  dept on emp.DEPTNO = dept.DEPTNO
where job = '과장';

-- 5. 직속 상관이 "감우성"인 직원들의 이름(ename),직급(job)를 출력하는 SQL문을 작성하시오.. 6개
select empno, ename, mgr from emp;


-- 6. "감우성"과 같은 근무지에서 일하는 직급이 '사원'인 직원만 출력하는 SQL문을 작성하시오..4개				    

-- 7. '이문세'와 동일한 직급을 가진 사원을 출력하는 SQL문을 작성하시오.. 4개

-- 8. 부서별로 가장 급여를 많이 받는 사원의 
--    사원번호, 사원이름, 급여, 부서번호, 부서명를 출력하는 SQL문을 작성하시오.. 8개

-- 9. 직급(job) 과장이 속해 있는 부서의 부서번호와 부서명, 위치 
--    그리고 그 부서에 속한 사원들의 정보를 출력하는 SQL문을 작성하시오.. 9개

-- 10. 부서별로 과장보다 많은 급여를 받는 같은 부서에 근무하는 
--     직원들의 이름, 부서명, 직급, 급여를 출력하는 SQL문을 작성하시오.
--     단, 과장은 출력하지 마시오. 3개
 