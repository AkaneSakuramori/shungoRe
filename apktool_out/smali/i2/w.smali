.class public final synthetic Li2/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/y;
.implements Ll2/e;
.implements Li0/s;


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Li2/w;->b:I

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lm/f;Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 3

    iget v0, p0, Li2/w;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object p2, p2, Lm/f;->a:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    new-instance v1, Landroid/content/ComponentName;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v2, 0x80

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ll2/c;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :cond_0
    invoke-direct {v1, v0, p3}, Ll2/c;-><init>(Landroid/os/Bundle;Landroid/content/res/Resources;)V

    sget p3, Ll2/h;->b:I

    new-instance p3, Landroid/content/Intent;

    const-class v0, Ll2/h;

    invoke-direct {p3, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.LAUNCH_URL"

    invoke-virtual {p3, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    sget-object p2, Lz/d;->a:Ljava/lang/Object;

    iget p2, v1, Ll2/c;->a:I

    invoke-static {p1, p2}, Lz/c;->a(Landroid/content/Context;I)I

    move-result p2

    const-string v0, "com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_STATUS_BAR_COLOR"

    invoke-virtual {p3, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget p2, v1, Ll2/c;->b:I

    invoke-static {p1, p2}, Lz/c;->a(Landroid/content/Context;I)I

    move-result p2

    const-string v0, "com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_NAVIGATION_BAR_COLOR"

    invoke-virtual {p3, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object p2, v1, Ll2/c;->c:Ljava/util/List;

    if-eqz p2, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p2, "com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_EXTRA_ORIGINS"

    invoke-virtual {p3, p2, v0}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    :cond_1
    invoke-virtual {p1, p3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    if-eqz p4, :cond_2

    invoke-interface {p4}, Ljava/lang/Runnable;->run()V

    :cond_2
    return-void

    :pswitch_0
    iget-object v0, p2, Lm/f;->b:Ll/c;

    invoke-virtual {v0}, Ll/c;->a()Li/a0;

    move-result-object v0

    if-eqz p3, :cond_3

    iget-object v1, v0, Li/a0;->c:Ljava/lang/Object;

    check-cast v1, Landroid/content/Intent;

    invoke-virtual {v1, p3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    :cond_3
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p3

    const-string v1, "org.chromium.arc"

    invoke-virtual {p3, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_4

    iget-object p3, v0, Li/a0;->c:Ljava/lang/Object;

    check-cast p3, Landroid/content/Intent;

    const-string v1, "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY"

    const/4 v2, 0x1

    invoke-virtual {p3, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_4
    iget-object p3, v0, Li/a0;->c:Ljava/lang/Object;

    check-cast p3, Landroid/content/Intent;

    iget-object p2, p2, Lm/f;->a:Landroid/net/Uri;

    invoke-virtual {p3, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object p2, v0, Li/a0;->c:Ljava/lang/Object;

    check-cast p2, Landroid/content/Intent;

    iget-object p3, v0, Li/a0;->d:Ljava/lang/Object;

    check-cast p3, Landroid/os/Bundle;

    sget-object v0, Lz/d;->a:Ljava/lang/Object;

    invoke-static {p1, p2, p3}, Lz/a;->b(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    if-eqz p4, :cond_5

    invoke-interface {p4}, Ljava/lang/Runnable;->run()V

    :cond_5
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Landroid/view/View;Li0/c2;)Li0/c2;
    .locals 4

    sget v0, Lcom/shungo/app/MainActivity;->F:I

    const-string v0, "view"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Li0/c2;->a:Li0/a2;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Li0/a2;->f(I)Lb0/c;

    move-result-object v0

    const-string v1, "getInsets(...)"

    invoke-static {v0, v1}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, v0, Lb0/c;->a:I

    iget v2, v0, Lb0/c;->b:I

    iget v3, v0, Lb0/c;->c:I

    iget v0, v0, Lb0/c;->d:I

    invoke-virtual {p1, v1, v2, v3, v0}, Landroid/view/View;->setPadding(IIII)V

    return-object p2
.end method
