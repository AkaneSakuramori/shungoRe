.class public final Le;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final DownloadUpdate(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le;->a:Landroid/content/Context;

    const-string v1, "download"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.DownloadManager"

    invoke-static {v0, v1}, Lc3/h;->Y(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/DownloadManager;

    new-instance v1, Landroid/app/DownloadManager$Request;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v1, p1}, Landroid/app/DownloadManager$Request;-><init>(Landroid/net/Uri;)V

    const-string p1, "Shungo Update"

    invoke-virtual {v1, p1}, Landroid/app/DownloadManager$Request;->setTitle(Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;

    const-string p1, "Downloading new Shungo version..."

    invoke-virtual {v1, p1}, Landroid/app/DownloadManager$Request;->setDescription(Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;

    const/4 p1, 0x1

    invoke-virtual {v1, p1}, Landroid/app/DownloadManager$Request;->setNotificationVisibility(I)Landroid/app/DownloadManager$Request;

    sget-object p1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    const-string v2, "shungo.apk"

    invoke-virtual {v1, p1, v2}, Landroid/app/DownloadManager$Request;->setDestinationInExternalPublicDir(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    invoke-virtual {v0, v1}, Landroid/app/DownloadManager;->enqueue(Landroid/app/DownloadManager$Request;)J

    return-void
.end method

.method public final SaveLogs()V
    .locals 11
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "pm grant "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Le;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx2/d;->a([Ljava/lang/String;)Ly2/g;

    move-result-object v0

    invoke-virtual {v0}, Ly2/g;->S2()Lc3/h;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " android.permission.MANAGE_EXTERNAL_STORAGE"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx2/d;->a([Ljava/lang/String;)Ly2/g;

    move-result-object v0

    invoke-virtual {v0}, Ly2/g;->S2()Lc3/h;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " android.permission.READ_EXTERNAL_STORAGE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx2/d;->a([Ljava/lang/String;)Ly2/g;

    move-result-object v0

    invoke-virtual {v0}, Ly2/g;->S2()Lc3/h;

    new-instance v0, Ljava/io/File;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v3, "shungologs.txt"

    invoke-direct {v0, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v4, "logs"

    invoke-direct {v0, v1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_1
    new-instance v1, Ljava/io/File;

    const-string v4, "shungo.log"

    invoke-direct {v1, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v4

    const-string v6, "shungo.log.1"

    invoke-direct {v0, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    const-string v6, ""

    const/4 v7, 0x0

    const/4 v8, 0x0

    sget-object v9, Lu2/m;->c:Lu2/m;

    const/16 v10, 0x1e

    invoke-static/range {v5 .. v10}, La3/n;->g3(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj3/l;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_6

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    const-string v1, "logcat -d -t 5000"

    invoke-virtual {v0, v1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    const-string v1, "getInputStream(...)"

    invoke-static {v0, v1}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lq3/a;->a:Ljava/nio/charset/Charset;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-direct {v4, v0, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    instance-of v0, v4, Ljava/io/BufferedReader;

    if-eqz v0, :cond_4

    check-cast v4, Ljava/io/BufferedReader;

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/io/BufferedReader;

    const/16 v1, 0x2000

    invoke-direct {v0, v4, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    move-object v4, v0

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_5

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_7

    const-string v1, "Saved logs to /sdcard/"

    const-string v4, "move logs: "

    const-string v5, "mv "

    const-string v6, "logs : "

    const/4 v7, 0x0

    :try_start_0
    new-instance v8, Ljava/io/File;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v9

    invoke-direct {v8, v9, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    sget-object v9, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v9, v6}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-virtual {v8}, Ljava/io/File;->createNewFile()Z

    new-instance v6, Ljava/io/FileWriter;

    invoke-direct {v6, v8}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    invoke-virtual {v6, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/Writer;->flush()V

    invoke-virtual {v6}, Ljava/io/Writer;->close()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " /sdcard/"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9, v4}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx2/d;->a([Ljava/lang/String;)Ly2/g;

    move-result-object v0

    invoke-virtual {v0}, Ly2/g;->S2()Lc3/h;

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Error saving logs : "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_7
    :goto_2
    return-void
.end method

.method public final SaveSettings(Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "settings"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "Saving settings: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    iget-object v1, p0, Le;->a:Landroid/content/Context;

    const-string v2, "shungo"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    const-string p1, "Settings saved!"

    invoke-static {v1, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final copyToClipboard(Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Le;->a:Landroid/content/Context;

    instance-of v1, v0, Lcom/shungo/app/MainActivity;

    if-eqz v1, :cond_0

    sget-object v1, Lz/d;->a:Ljava/lang/Object;

    const-class v1, Landroid/content/ClipboardManager;

    invoke-static {v0, v1}, Lz/c;->b(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.content.ClipboardManager"

    invoke-static {v0, v1}, Lc3/h;->Y(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/content/ClipboardManager;

    const-string v1, "text"

    invoke-static {v1, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v1

    const-string v2, "Copied "

    const-string v3, " to clipboard"

    invoke-static {v2, p1, v3}, La;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    :cond_0
    return-void
.end method

.method public final hasOverlayPermission()Z
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Le;->a:Landroid/content/Context;

    instance-of v1, v0, Lcom/shungo/app/MainActivity;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/shungo/app/MainActivity;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final onDowngradeArtClick()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "pm uninstall com.google.android.art && reboot"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx2/d;->a([Ljava/lang/String;)Ly2/g;

    move-result-object v0

    invoke-virtual {v0}, Ly2/g;->S2()Lc3/h;

    const/4 v0, 0x1

    iget-object v1, p0, Le;->a:Landroid/content/Context;

    const-string v2, "ART downgrade done, please reboot your device"

    invoke-static {v1, v2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final onLoginClick()V
    .locals 14
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Le;->a:Landroid/content/Context;

    instance-of v1, v0, Lcom/shungo/app/MainActivity;

    if-eqz v1, :cond_a

    check-cast v0, Lcom/shungo/app/MainActivity;

    iget-object v1, v0, Lcom/shungo/app/MainActivity;->y:Lf1/a;

    const/4 v2, 0x0

    if-eqz v1, :cond_9

    sget-object v3, Lj1/p0;->a:Ljava/lang/String;

    new-instance v3, Lj1/n0;

    invoke-direct {v3, v1}, Lj1/n0;-><init>(Lf1/a;)V

    const v4, 0x7f0f0034

    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "getString(...)"

    invoke-static {v4, v5}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v6, "ROOT"

    invoke-static {v5, v6}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v5, v6}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v5}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    sget-object v5, Lj1/p0;->a:Ljava/lang/String;

    const-string v6, "Please provide the scheme in lowercase and make sure it\'s the same configured in the intent filter. Android expects the scheme to be lowercase."

    invoke-static {v5, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iput-object v4, v3, Lj1/n0;->c:Ljava/lang/String;

    iget-object v4, v3, Lj1/n0;->a:Ljava/util/LinkedHashMap;

    const-string v5, "scope"

    const-string v6, "openid profile email offline_access"

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Landroidx/fragment/app/k;

    const/4 v7, 0x0

    invoke-direct {v6, v7, v0}, Landroidx/fragment/app/k;-><init>(ILjava/lang/Object;)V

    sput-object v2, Lj1/p0;->b:Lc3/h;

    iget-object v7, v3, Lj1/n0;->e:Lj1/m;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v8

    invoke-virtual {v7, v8}, Lj1/m;->a(Landroid/content/pm/PackageManager;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_8

    new-instance v7, Lj1/c0;

    iget-object v8, v3, Lj1/n0;->e:Lj1/m;

    invoke-direct {v7, v1, v6, v4, v8}, Lj1/c0;-><init>(Lf1/a;Landroidx/fragment/app/k;Ljava/util/LinkedHashMap;Lj1/m;)V

    iget-object v4, v3, Lj1/n0;->b:Ljava/util/LinkedHashMap;

    const-string v6, "headers"

    invoke-static {v4, v6}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v7, Lj1/c0;->n:Ljava/util/HashMap;

    invoke-virtual {v6, v4}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    iput-object v2, v7, Lj1/c0;->q:Lj1/h0;

    iput-object v2, v7, Lj1/c0;->r:Ljava/lang/Integer;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    iget-object v8, v7, Lj1/c0;->p:Lg1/b;

    if-eqz v4, :cond_1

    iget-object v2, v8, Lg1/b;->a:Lf1/a;

    iget-object v2, v2, Lf1/a;->b:Lt3/s;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :cond_1
    iput-object v2, v7, Lj1/c0;->s:Ljava/lang/String;

    sput-object v7, Lj1/p0;->b:Lc3/h;

    iget-object v2, v3, Lj1/n0;->d:Ljava/lang/String;

    if-nez v2, :cond_2

    iget-object v2, v3, Lj1/n0;->c:Ljava/lang/String;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    iget-object v1, v1, Lf1/a;->b:Lt3/s;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v4, v1}, Lc3/h;->M0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v3, Lj1/n0;->d:Ljava/lang/String;

    :cond_2
    iget-object v1, v3, Lj1/n0;->d:Ljava/lang/String;

    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v2, v7, Lj1/c0;->m:Ljava/util/LinkedHashMap;

    const-string v3, "parameters"

    invoke-static {v2, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v2}, La3/j;->X2(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lc3/h;->i1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_3
    const-string v3, "openid profile email"

    :goto_0
    invoke-interface {v2, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v7, Lj1/c0;->q:Lj1/h0;

    if-nez v3, :cond_4

    new-instance v3, Lj1/h0;

    invoke-direct {v3, v8, v1, v6}, Lj1/h0;-><init>(Lg1/b;Ljava/lang/String;Ljava/util/HashMap;)V

    iput-object v3, v7, Lj1/c0;->q:Lj1/h0;

    :cond_4
    iget-object v3, v7, Lj1/c0;->q:Lj1/h0;

    invoke-static {v3}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v3, v3, Lj1/h0;->d:Ljava/lang/String;

    const-string v4, "codeChallenge"

    invoke-static {v3, v4}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "code_challenge"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "code_challenge_method"

    const-string v4, "S256"

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lj1/c0;->t:Ljava/lang/String;

    const-string v4, "Using PKCE authentication flow"

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v4, v7, Lj1/c0;->j:Lf1/a;

    iget-object v5, v4, Lf1/a;->c:Lm1/a;

    iget-object v5, v5, Lm1/a;->a:Ljava/lang/String;

    const-string v6, "auth0Client"

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "client_id"

    iget-object v6, v4, Lf1/a;->a:Ljava/lang/String;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "redirect_uri"

    invoke-interface {v2, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "state"

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "encodeToString(\n        \u2026.NO_PADDING\n            )"

    const/16 v8, 0xb

    const/16 v9, 0x20

    if-nez v5, :cond_5

    new-instance v5, Ljava/security/SecureRandom;

    invoke-direct {v5}, Ljava/security/SecureRandom;-><init>()V

    new-array v10, v9, [B

    invoke-virtual {v5, v10}, Ljava/security/SecureRandom;->nextBytes([B)V

    invoke-static {v10, v8}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v6}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    const-string v10, "nonce"

    invoke-interface {v2, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    if-nez v11, :cond_6

    new-instance v11, Ljava/security/SecureRandom;

    invoke-direct {v11}, Ljava/security/SecureRandom;-><init>()V

    new-array v9, v9, [B

    invoke-virtual {v11, v9}, Ljava/security/SecureRandom;->nextBytes([B)V

    invoke-static {v9, v8}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v6}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_6
    invoke-interface {v2, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v4, Lf1/a;->b:Lt3/s;

    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lt3/s;->f()Lt3/r;

    move-result-object v1

    const-string v9, "authorize"

    const/4 v10, 0x0

    const/16 v11, 0x9

    const/4 v12, 0x0

    const/4 v13, 0x1

    move-object v8, v1

    invoke-virtual/range {v8 .. v13}, Lt3/r;->d(Ljava/lang/String;IIZZ)V

    invoke-virtual {v1}, Lt3/r;->b()Lt3/s;

    move-result-object v1

    iget-object v1, v1, Lt3/s;->h:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1, v5, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_1

    :cond_7
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Using the following Authorize URI: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v2, "uri"

    invoke-static {v1, v2}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lcom/auth0/android/provider/AuthenticationActivity;->d:I

    iget-boolean v2, v7, Lj1/c0;->l:Z

    iget-object v3, v7, Lj1/c0;->o:Lj1/m;

    invoke-static {v0, v1, v2, v3}, Lz0/c;->a(Lcom/shungo/app/MainActivity;Landroid/net/Uri;ZLj1/m;)V

    goto :goto_2

    :cond_8
    new-instance v0, Lg1/c;

    const-string v1, "a0.browser_not_available"

    const-string v2, "No compatible Browser application is installed."

    invoke-direct {v0, v1, v2}, Lg1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Landroidx/fragment/app/k;->a(Lf1/b;)V

    goto :goto_2

    :cond_9
    const-string v0, "account"

    invoke-static {v0}, Lc3/h;->E2(Ljava/lang/String;)V

    throw v2

    :cond_a
    :goto_2
    return-void
.end method

.method public final onLogoutClick()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Le;->a:Landroid/content/Context;

    instance-of v1, v0, Lcom/shungo/app/MainActivity;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/shungo/app/MainActivity;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lu2/o;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lu2/o;-><init>(Lcom/shungo/app/MainActivity;I)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final onStartClick()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Le;->a:Landroid/content/Context;

    instance-of v0, v0, Lcom/shungo/app/MainActivity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lr3/x;->a:Lkotlinx/coroutines/scheduling/d;

    sget-object v0, Lkotlinx/coroutines/internal/k;->a:Lr3/q0;

    new-instance v1, Ld;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Ld;-><init>(Le;Lc3/e;)V

    invoke-static {v0, v1}, Lc3/h;->s1(Lr3/q0;Lj3/p;)V

    return-void
.end method

.method public final onStopClick()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Le;->a:Landroid/content/Context;

    instance-of v1, v0, Lcom/shungo/app/MainActivity;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/shungo/app/MainActivity;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/shungo/app/MainActivity;->p(Z)V

    invoke-static {v0}, Lc3/h;->B2(Landroid/content/Context;)V

    check-cast v0, Lcom/shungo/app/MainActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shungo/app/MainActivity;->p(Z)V

    :cond_0
    return-void
.end method

.method public final requestOverlayPermission()V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Le;->a:Landroid/content/Context;

    instance-of v1, v0, Lcom/shungo/app/MainActivity;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/shungo/app/MainActivity;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/content/Intent;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "package:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    const-string v3, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    invoke-direct {v1, v3, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    iget-object v0, v0, Lcom/shungo/app/MainActivity;->D:Landroidx/activity/result/d;

    invoke-virtual {v0, v1}, Landroidx/activity/result/d;->Q2(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
