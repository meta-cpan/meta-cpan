DESCRIPTION = "Devel::StackTrace::AsHTML adds "as_html" method to Devel::StackTrace \
which displays the stack trace in beautiful HTML, with code snippet \
context and \
function parameters. If you call it on an instance of \
Devel::StackTrace::WithLexicals, you even get to see the lexical \
variables \
of each stack frame."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-StackTrace-AsHTML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS += "devel-stacktrace-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MI/MIYAGAWA/Devel-StackTrace-AsHTML-0.14.tar.gz"

SRC_URI[md5sum] = "232c8b4d639adfbcf98e3fe92337756c"
SRC_URI[sha256sum] = "89056a3d5ec559c8fac35890f1ad50452ec18524ed4bfc245f9e3b0cbc49827a"

S = "${WORKDIR}/Devel-StackTrace-AsHTML-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
