DESCRIPTION = "File::HomeDir is a module for locating the directories that are \
\"owned\" by a user (typicaly your user) and to solve the various \
issues that arise trying \
to find them consistently across a wide variety of platforms."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-HomeDir"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AD/ADAMK/File-HomeDir-1.00.tar.gz"

SRC_URI[md5sum] = "aa290cab9db52e2f76280fd1febf794e"
SRC_URI[sha256sum] = "85b94f3513093ec0a25b91f9f2571918519ae6f2b7a1e8546f8f78d09a877143"
RDEPENDS_${PN} += "file-which-perl"
DEPENDS += "extutils-makemaker-perl-native"

S = "${WORKDIR}/File-HomeDir-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
