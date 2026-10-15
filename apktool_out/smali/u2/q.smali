.class public final synthetic Lu2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/shungo/app/MainActivity;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/shungo/app/MainActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/q;->b:Lcom/shungo/app/MainActivity;

    iput-object p2, p0, Lu2/q;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    sget p2, Lcom/shungo/app/MainActivity;->F:I

    const-string p2, "market://details?id="

    const-string v0, "this$0"

    iget-object v1, p0, Lu2/q;->b:Lcom/shungo/app/MainActivity;

    invoke-static {v1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$webViewPackageName"

    iget-object v2, p0, Lu2/q;->c:Ljava/lang/String;

    invoke-static {v2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.intent.action.VIEW"

    :try_start_0
    new-instance v3, Landroid/content/Intent;

    invoke-virtual {p2, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-direct {v3, v0, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v1, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance p2, Landroid/content/Intent;

    const-string v3, "https://play.google.com/store/apps/details?id="

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {p2, v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :goto_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void
.end method
