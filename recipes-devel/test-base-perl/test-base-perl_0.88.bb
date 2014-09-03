DESCRIPTION = "Testing is usually the ugly part of Perl module authoring. Perl gives \
you a standard way to run tests with Test::Harness, and basic testing \
primitives \
with Test::More. After that you are pretty much on your own to develop \
a \
testing framework and philosophy. Test::More encourages you to make \
your own \
framework by subclassing Test::Builder, but that is not trivial."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Base"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/I/IN/INGY/Test-Base-0.88.tar.gz"

SRC_URI[md5sum] = "ced0cd86b099f9fd2cd73df1f46ab5e9"
SRC_URI[sha256sum] = "52368cc5a9cbbc4eaba33ed820672f92001b73d8bcba0bb95d5fdb1d370b9039"
RDEPENDS_${PN} += "spiffy-perl"
DEPENDS += "algorithm-diff-perl-native"
DEPENDS += "text-diff-perl-native"

S = "${WORKDIR}/Test-Base-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
