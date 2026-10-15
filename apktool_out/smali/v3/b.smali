.class public final Lv3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Li/w;


# direct methods
.method public constructor <init>(JLi/w;)V
    .locals 0

    const-string p1, "request"

    invoke-static {p3, p1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lv3/b;->a:Li/w;

    return-void
.end method
