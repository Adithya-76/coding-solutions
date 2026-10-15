# Write your MySQL query statement below
select * from users
where RegExp_Like(mail , '^[a-zA-Z][A-Za-z0-9_.-]*@leetcode\\.com$','c')