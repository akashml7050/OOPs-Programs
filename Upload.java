class Post
{
	public void Like()
	{
		System.out.println("Your Post was Liked");
	}
	public void Comment()
	{
		System.out.println("Someone Commented on your Post");
	}
}
interface PictureEdit
{
	public void ApplyFilter();
}
interface VideoEdit
{
	public void MuteAudio();
}
class Picture extends Post implements PictureEdit
{
	public void UploadPhoto()
	{
		System.out.println("Your Photo was Uploaded");
	}
	public void ApplyFilter()
	{
		System.out.println("Filter Applied");
	}
}
class Video extends Post implements VideoEdit
{
	public void UploadVideo()
	{
		System.out.println("Your Video was Uploaded");
	}
	public void MuteAudio()
	{
		System.out.println("Audio Muted");
	}
}
class Upload
{
	public static void main(String[] args) 
	{
		Picture pic = new Picture();
		pic.UploadPhoto();
		pic.ApplyFilter();
		pic.Like();
		System.out.println();
		Video vid = new Video();
		vid.UploadVideo();
		vid.MuteAudio();
		vid.Comment();
	}
}