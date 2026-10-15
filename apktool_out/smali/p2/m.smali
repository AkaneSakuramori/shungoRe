.class public final Lp2/m;
.super Lm2/b0;
.source "SourceFile"


# static fields
.field public static final b:Lp2/l;


# instance fields
.field public final a:Lm2/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lm2/z;->c:Lm2/w;

    new-instance v1, Lp2/m;

    invoke-direct {v1, v0}, Lp2/m;-><init>(Lm2/w;)V

    new-instance v0, Lp2/l;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lp2/l;-><init>(ILjava/lang/Object;)V

    sput-object v0, Lp2/m;->b:Lp2/l;

    return-void
.end method

.method public constructor <init>(Lm2/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp2/m;->a:Lm2/a0;

    return-void
.end method


# virtual methods
.method public final b(Lt2/b;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Lt2/b;->T()I

    move-result v0

    invoke-static {v0}, Lp/h;->a(I)I

    move-result v1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_1

    const/4 v2, 0x6

    if-eq v1, v2, :cond_1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Lt2/b;->P()V

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Lm2/r;

    invoke-static {v0}, La;->s(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Expecting number, got: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lp2/m;->a:Lm2/a0;

    invoke-interface {v0, p1}, Lm2/a0;->a(Lt2/b;)Ljava/lang/Number;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final c(Lt2/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p1, p2}, Lt2/c;->L(Ljava/lang/Number;)V

    return-void
.end method
