DESCRIPTION = "This module works around two historical bugs in Perl's handling of the \
\"%^H\" (lexical hints) variable. One bug causes lexical state in one \
file to leak \
into another that is \"require\"d/\"use\"d from it. This bug, [perl \
\#68590], was \
present from Perl 5.6 up to Perl 5.10, fixed in Perl 5.11.0. The second \
bug \
causes lexical state (normally a blank \"%^H\" once the first bug is \
fixed) to \
leak outwards from \"utf8.pm\", if it is automatically loaded during \
Unicode \
regular expression matching, into whatever source is compiling at the \
time \
of the regexp match. This bug, [perl \#73174], was present from Perl \
5.8.7 up \
to Perl 5.11.5, fixed in Perl 5.12.0."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Lexical-SealRequireHints"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/Z/ZE/ZEFRAM/Lexical-SealRequireHints-0.007.tar.gz"

SRC_URI[md5sum] = "eff25e457f66a598a3a1631b27ce1b72"
SRC_URI[sha256sum] = "8aa0d3cb33e4fde6facf1ff852a9cdd0247c9217f4b641c43fe5195b7db30f77"
DEPENDS += "perl"

S = "${WORKDIR}/Lexical-SealRequireHints-${PV}"

inherit cpan_build

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_build_do_compile
}

BBCLASSEXTEND = "native"
