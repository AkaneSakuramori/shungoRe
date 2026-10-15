.class public final synthetic Lu2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/shungo/app/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/shungo/app/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/r;->b:Lcom/shungo/app/MainActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    sget p2, Lcom/shungo/app/MainActivity;->F:I

    iget-object p2, p0, Lu2/r;->b:Lcom/shungo/app/MainActivity;

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    invoke-virtual {p2}, Lcom/shungo/app/MainActivity;->o()Landroid/webkit/WebView;

    move-result-object p1

    new-instance v0, Lu2/o;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1}, Lu2/o;-><init>(Lcom/shungo/app/MainActivity;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
