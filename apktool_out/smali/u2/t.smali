.class public final Lu2/t;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/shungo/app/MainActivity;


# direct methods
.method public constructor <init>(Lcom/shungo/app/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lu2/t;->a:Lcom/shungo/app/MainActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lu2/t;->a:Lcom/shungo/app/MainActivity;

    iget-boolean p2, p1, Lcom/shungo/app/MainActivity;->C:Z

    if-eqz p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/shungo/app/MainActivity;->q()V

    const/4 p2, 0x1

    iput-boolean p2, p1, Lcom/shungo/app/MainActivity;->C:Z

    return-void
.end method
