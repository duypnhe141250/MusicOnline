USE [master]
GO
/****** Object:  Database [WebBase]    Script Date: 22/07/2021 2:57:46 CH ******/
CREATE DATABASE [WebBase]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'WebBase', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\WebBase.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'WebBase_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\WebBase_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [WebBase] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [WebBase].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [WebBase] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [WebBase] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [WebBase] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [WebBase] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [WebBase] SET ARITHABORT OFF 
GO
ALTER DATABASE [WebBase] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [WebBase] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [WebBase] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [WebBase] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [WebBase] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [WebBase] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [WebBase] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [WebBase] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [WebBase] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [WebBase] SET  DISABLE_BROKER 
GO
ALTER DATABASE [WebBase] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [WebBase] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [WebBase] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [WebBase] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [WebBase] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [WebBase] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [WebBase] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [WebBase] SET RECOVERY FULL 
GO
ALTER DATABASE [WebBase] SET  MULTI_USER 
GO
ALTER DATABASE [WebBase] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [WebBase] SET DB_CHAINING OFF 
GO
ALTER DATABASE [WebBase] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [WebBase] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [WebBase] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [WebBase] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'WebBase', N'ON'
GO
ALTER DATABASE [WebBase] SET QUERY_STORE = OFF
GO
USE [WebBase]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 22/07/2021 2:57:46 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[accountID] [int] IDENTITY(1,1) NOT NULL,
	[username] [nvarchar](50) NULL,
	[password] [nvarchar](50) NULL,
	[roleID] [int] NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[accountID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Album]    Script Date: 22/07/2021 2:57:46 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Album](
	[albumID] [nvarchar](50) NOT NULL,
	[albumName] [nvarchar](50) NULL,
	[img] [nvarchar](50) NULL,
 CONSTRAINT [PK_Album] PRIMARY KEY CLUSTERED 
(
	[albumID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 22/07/2021 2:57:46 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[categoryID] [nvarchar](50) NOT NULL,
	[categoryName] [nvarchar](50) NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[categoryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Role]    Script Date: 22/07/2021 2:57:46 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Role](
	[roleID] [int] NOT NULL,
	[roleName] [nvarchar](50) NULL,
 CONSTRAINT [PK_Role] PRIMARY KEY CLUSTERED 
(
	[roleID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Song]    Script Date: 22/07/2021 2:57:46 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Song](
	[songID] [int] IDENTITY(1,1) NOT NULL,
	[songName] [nvarchar](50) NULL,
	[accountID] [int] NULL,
	[categoryID] [nvarchar](50) NULL,
	[albumID] [nvarchar](50) NULL,
	[image] [nvarchar](50) NULL,
	[source] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Song] PRIMARY KEY CLUSTERED 
(
	[songID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Account] ON 

INSERT [dbo].[Account] ([accountID], [username], [password], [roleID]) VALUES (1, N'sa', N'123', 1)
INSERT [dbo].[Account] ([accountID], [username], [password], [roleID]) VALUES (2, N'mra', N'123', 2)
INSERT [dbo].[Account] ([accountID], [username], [password], [roleID]) VALUES (3, N'mrb', N'123', 3)
SET IDENTITY_INSERT [dbo].[Account] OFF
GO
INSERT [dbo].[Album] ([albumID], [albumName], [img]) VALUES (N'1', N'Các bài nhạc hot ', NULL)
INSERT [dbo].[Album] ([albumID], [albumName], [img]) VALUES (N'2', N'Nhạc điện tử', N'img/album/edm.jpg')
INSERT [dbo].[Album] ([albumID], [albumName], [img]) VALUES (N'3', N'Các ca khúc bất diệt', NULL)
INSERT [dbo].[Album] ([albumID], [albumName], [img]) VALUES (N'35', N'Nhạc dân dã', N'img/album/danda.jpg')
GO
INSERT [dbo].[Category] ([categoryID], [categoryName]) VALUES (N'122133', N'214214')
INSERT [dbo].[Category] ([categoryID], [categoryName]) VALUES (N'a', N'duuyyy ')
INSERT [dbo].[Category] ([categoryID], [categoryName]) VALUES (N'b', N'b')
INSERT [dbo].[Category] ([categoryID], [categoryName]) VALUES (N'EDM', N'b')
INSERT [dbo].[Category] ([categoryID], [categoryName]) VALUES (N'KPop', N'Korean Music')
INSERT [dbo].[Category] ([categoryID], [categoryName]) VALUES (N'Lofi', N'Chill Music')
INSERT [dbo].[Category] ([categoryID], [categoryName]) VALUES (N'US-UK', N'Eng Music/America Music')
INSERT [dbo].[Category] ([categoryID], [categoryName]) VALUES (N'VPop', N'Vietnamese Music')
GO
INSERT [dbo].[Role] ([roleID], [roleName]) VALUES (1, N'admin')
INSERT [dbo].[Role] ([roleID], [roleName]) VALUES (2, N'non-prime')
INSERT [dbo].[Role] ([roleID], [roleName]) VALUES (3, N'prime')
GO
SET IDENTITY_INSERT [dbo].[Song] ON 

INSERT [dbo].[Song] ([songID], [songName], [accountID], [categoryID], [albumID], [image], [source]) VALUES (1, N'Hello', 1, N'US-UK', N'35', N'img/album/Hello.jpg', N'audio/Hello.mp3')
INSERT [dbo].[Song] ([songID], [songName], [accountID], [categoryID], [albumID], [image], [source]) VALUES (2, N'Tìm Tôi', NULL, N'VPop', NULL, N'img/album/TimToi.jpg', N'audio/TimToi.mp3')
INSERT [dbo].[Song] ([songID], [songName], [accountID], [categoryID], [albumID], [image], [source]) VALUES (3, N'Baby shark', 1, N'a', N'', N'img/album/baby.jpg', N'audio/BabyShark.mp3')
INSERT [dbo].[Song] ([songID], [songName], [accountID], [categoryID], [albumID], [image], [source]) VALUES (4, N'Baby', 1, NULL, N'34', N'', N'audio/BabyShark.mp3')
INSERT [dbo].[Song] ([songID], [songName], [accountID], [categoryID], [albumID], [image], [source]) VALUES (5, N'Shimmer', 1, NULL, N'2', N'img/albumNCS.jpg', N'audio/Shimmer.mp3')
INSERT [dbo].[Song] ([songID], [songName], [accountID], [categoryID], [albumID], [image], [source]) VALUES (6, N'sadas', 1, NULL, N'dfs', N'img/albumBabyShark.mp3', N'audio/Shimmer.mp3')
INSERT [dbo].[Song] ([songID], [songName], [accountID], [categoryID], [albumID], [image], [source]) VALUES (7, N'asdsad', 1, NULL, N'daagg', N'img/albumNCS.jpg', N'audio/Seasons.mp3')
INSERT [dbo].[Song] ([songID], [songName], [accountID], [categoryID], [albumID], [image], [source]) VALUES (8, N'asdsad', 1, NULL, N'daagg', N'img/albumTimToi.mp3', N'audio/Seasons.mp3')
SET IDENTITY_INSERT [dbo].[Song] OFF
GO
USE [master]
GO
ALTER DATABASE [WebBase] SET  READ_WRITE 
GO
