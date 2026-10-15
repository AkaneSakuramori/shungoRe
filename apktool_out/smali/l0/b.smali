.class public final synthetic Ll0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj0/d;
.implements Landroidx/activity/result/c;


# instance fields
.field public final synthetic a:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll0/b;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Ll0/b;->a:Ljava/lang/Object;

    check-cast v0, Lcom/shungo/app/MainActivity;

    check-cast p1, Landroidx/activity/result/b;

    sget p1, Lcom/shungo/app/MainActivity;->F:I

    const-string p1, "this$0"

    invoke-static {v0, p1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result p1

    invoke-virtual {v0}, Lcom/shungo/app/MainActivity;->o()Landroid/webkit/WebView;

    move-result-object v1

    new-instance v2, Lu2/p;

    const/4 v3, 0x1

    invoke-direct {v2, v0, p1, v3}, Lu2/p;-><init>(Landroid/view/KeyEvent$Callback;ZI)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
