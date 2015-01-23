DESCRIPTION = "USING THE AppConfig MODULE To import and use the AppConfig module the \
following line should appear in \
your Perl script:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/AppConfig"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NE/NEILB/AppConfig-1.67.tar.gz"

SRC_URI[md5sum] = "3c84263a88c66779df3f0948a8c6786b"
SRC_URI[sha256sum] = "6065f9662ea9e74ebe17564b07d918043bb1cf0ae88b15201d0feeb0791b2207"

S = "${WORKDIR}/AppConfig-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
