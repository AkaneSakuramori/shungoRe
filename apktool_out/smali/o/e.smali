.class public final Lo/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lo/e;


# instance fields
.field public volatile a:Ljava/lang/Thread;

.field public volatile b:Lo/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/e;->c:Lo/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lo/f;->f:Lc3/h;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lc3/h;->Y1(Lo/e;Ljava/lang/Thread;)V

    return-void
.end method
