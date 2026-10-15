.class public final Lr3/b;
.super Lr3/b0;
.source "SourceFile"


# instance fields
.field public final h:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Ljava/lang/Thread;)V
    .locals 0

    invoke-direct {p0}, Lr3/b0;-><init>()V

    iput-object p1, p0, Lr3/b;->h:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method public final H()Ljava/lang/Thread;
    .locals 1

    iget-object v0, p0, Lr3/b;->h:Ljava/lang/Thread;

    return-object v0
.end method
